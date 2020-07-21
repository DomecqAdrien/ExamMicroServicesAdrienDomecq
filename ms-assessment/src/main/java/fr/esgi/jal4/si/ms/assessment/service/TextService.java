package fr.esgi.jal4.si.ms.assessment.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import fr.esgi.jal4.si.ms.assessment.model.Request;

@Service
public class TextService {

	public ResponseEntity<String> concatenate(Request request) {
		String response = request.getStr1()+' '+request.getStr2();
		if(request.getStr1() == null || request.getStr2() == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return ResponseEntity.ok(response);
	}

	public String checkLastLength() {
		// TODO Auto-generated method stub
		return null;
	}

}
