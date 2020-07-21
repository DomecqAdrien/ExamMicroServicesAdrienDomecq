package fr.esgi.jal4.si.ms.assessment.controller;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.esgi.jal4.si.ms.assessment.model.Request;
import fr.esgi.jal4.si.ms.assessment.service.TextService;

@RestController
@RequestMapping("/api/text")
public class TextController {
	
	@Resource TextService textService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/concat")
	public ResponseEntity<String> concat(@RequestBody Request request) {
		return textService.concatenate(request);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/last_length")
	public String checkLastLength() {
		return textService.checkLastLength();
	}

}
