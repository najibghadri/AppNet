package org.appnet.mvc;

import java.security.Principal;

import org.appnet.PhotoServiceUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * Added to provide an endpoint from which Spring Social can obtain authentication details
 */
@RequestMapping("/me")
@Controller
public class AppNetUserController {
	
	@ResponseBody
	@RequestMapping("")
	public PhotoServiceUser getPhotoServiceUser(Principal principal)
	{
		return new PhotoServiceUser(principal.getName(),principal.getName());
	}
}
