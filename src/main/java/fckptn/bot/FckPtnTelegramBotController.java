package fckptn.bot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FckPtnTelegramBotController {

	@PostMapping("/")
	public ResponseEntity<Void> bot() {
		return ResponseEntity.ok().build();
	}

}
