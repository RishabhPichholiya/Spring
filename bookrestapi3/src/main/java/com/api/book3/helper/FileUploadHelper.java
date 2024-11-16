package com.api.book3.helper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.core.io.ClassPathResource;

@Component
public class FileUploadHelper {
	//public final String UPLOAD_DIR ="F:\\Spring Tool Suite\\Projects\\bookrestapi3\\src\\main\\resources\\static\\image";
	public final String UPLOAD_DIR =new ClassPathResource("/static/image").getFile().getAbsolutePath();
	
	public FileUploadHelper() throws IOException {
		
	}

	public boolean uploadFile(MultipartFile multipartfile) {
		boolean f =false;
		try {
			//
			/*InputStream is= multipartfile.getInputStream();
			byte data[]= new byte[is.available()];
			is.read(data);
			
			//write the data 
			FileOutputStream fos = new FileOutputStream(UPLOAD_DIR+File.separator+multipartfile.getOriginalFilename());
			fos.write(data);
			fos.flush();
			fos.close();
			*/
			
			Files.copy(multipartfile.getInputStream(), Paths.get(UPLOAD_DIR+File.separator+multipartfile.getOriginalFilename()) , StandardCopyOption.REPLACE_EXISTING);
			f =true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return f;
	}
}
