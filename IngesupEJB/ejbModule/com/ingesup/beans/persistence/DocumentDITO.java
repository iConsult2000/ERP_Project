package com.ingesup.beans.persistence;

import java.io.File;
import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class DocumentDITO extends Document implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 233566327228090904L;
	private Integer size;
	private File file;
	
	public DocumentDITO(){}
	
	public DocumentDITO(String nomDoc){
		super(nomDoc);
	}
	/**
	 * @return the size
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(Integer size) {
		this.size = size;
	}

	/**
	 * @return the file
	 */
	public File getFile() {
		return file;
	}

	/**
	 * @param file the file to set
	 */
	public void setFile(File file) {
		this.file = file;
	}

}
