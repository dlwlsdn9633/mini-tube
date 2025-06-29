package com.google.minitube.util;

import org.springframework.web.multipart.MultipartFile;

public interface ProfileImageUtil 
{
	public String upload(MultipartFile file);
}
