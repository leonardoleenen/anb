package bo.gob.aduanda.reglas.test;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

import javax.ws.rs.QueryParam;

import org.kie.api.KieServices;
import org.kie.api.builder.KieBuilder;
import org.kie.api.builder.KieFileSystem;
import org.kie.api.builder.KieRepository;
import org.kie.api.builder.Message.Level;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bo.gob.aduanda.reglas.facts.Canal;
import bo.gob.aduanda.reglas.facts.Despachante;
import bo.gob.aduanda.reglas.facts.Documento;

@Controller
@RequestMapping(value = "/")
public class IndexController {

	@RequestMapping(method = RequestMethod.GET)
	public String printHello(ModelMap model) {
		model.addAttribute("result", "");
		return "index";
	}

	@RequestMapping(value = "/calculate", method = RequestMethod.GET)
	public String calculate(ModelMap model, @QueryParam("destino") String destino, @QueryParam("despachanteContravenciones") String despachanteContravenciones, @QueryParam("documentoContravenciones") String documentoContravenciones, @QueryParam("modoTransporte") String modoTransporte, @QueryParam("tipoDespacho") String tipoDespacho, @QueryParam("verificacionDeDocumento") String verificacionDeDocumento, @QueryParam("mercancia") String mercancia, @QueryParam("tipoDocumento") String tipoDocumento, @QueryParam("despachanteDelitos") String despachanteDelitos, @QueryParam("despachantePendientes") String despachantePendientes, @QueryParam("despachanteAnuladas") String despachanteAnuladas, @QueryParam("despachanteModificadas") String despachanteModificadas, @QueryParam("documentoDelitos") String documentoDelitos, @QueryParam("documentoPendientes") String documentoPendientes, @QueryParam("documenntoAnuladas") String documenntoAnuladas,
			@QueryParam("documentoPrimerizo") String documentoPrimerizo) {
		try {
			KieServices ks = KieServices.Factory.get();
			KieRepository kr = ks.getRepository();

			KieFileSystem kfs = ks.newKieFileSystem();

			kfs.write(ks.getResources().newClassPathResource("ScoringDespachante.drl"));
			kfs.write(ks.getResources().newClassPathResource("selectividad_canal.drl"));

			KieBuilder kb = ks.newKieBuilder(kfs);

			kb.buildAll();

			if (kb.getResults().hasMessages(Level.ERROR)) {
				throw new RuntimeException("Build Errors:\n" + kb.getResults().toString());
			}

			KieContainer kContainer = ks.newKieContainer(kr.getDefaultReleaseId());

			KieSession kSession = kContainer.newKieSession();

			Canal canal = new Canal();
			canal.setDespachante(new Despachante());
			canal.setNroDocumento(new Documento());

			canal.setSubpartida(mercancia);
			canal.setModo_transporte(modoTransporte);
			canal.setDestino(destino);
			canal.setTipoDoc(tipoDocumento);
			canal.setVerificacion_documento(verificacionDeDocumento);

			canal.getNroDocumento().setAnuladas(Integer.parseInt(documenntoAnuladas));
			canal.getNroDocumento().setContravenciones(Integer.parseInt(documentoContravenciones));
			canal.getNroDocumento().setDelitos(Integer.parseInt(documentoDelitos));
			canal.getNroDocumento().setPendientes(Integer.parseInt(documentoPendientes));
			canal.getNroDocumento().setPrimerizo(("on".equalsIgnoreCase(documentoPrimerizo)) ? true : false);

			canal.getDespachante().setAnuladas(Integer.parseInt(despachanteAnuladas));
			canal.getDespachante().setContravenciones(Integer.parseInt(despachanteContravenciones));
			canal.getDespachante().setDelitos(Integer.parseInt(despachanteDelitos));
			canal.getDespachante().setPendientes(Integer.parseInt(despachantePendientes));
			canal.getDespachante().setModificadas(Integer.parseInt(despachanteModificadas));
			canal.getDespachante().setRiesgo("INDETERMINADO");

			kSession.insert(canal);
			kSession.fireAllRules();

			System.out.println("Regla" + canal.getRegla() + " Resultado: " + canal.getResultado());
			System.out.println("Riesgo Calculado: " + canal.getDespachante().getRiesgo());

			model.addAttribute("result", "Regla " + canal.getRegla() + " Resultado: " + canal.getResultado() + " | Riesgo Calculado: " + canal.getDespachante().getRiesgo());

		} catch (Throwable t) {
			t.printStackTrace();
		}
		return "index";
	}
}
