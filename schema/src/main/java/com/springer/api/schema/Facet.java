/**
 * 
 */
package com.springer.api.schema;

import java.util.HashMap;
import java.util.Map;

import com.springer.api.common.ValueEnum;

/**
 * @author nmukhtar
 *
 */
public enum Facet implements ValueEnum {
	/** The Filters. */
	SUBJECT("subject"), 
	KEYWORD("keyword"),
	PUB("pub"),
	YEAR("year"),
	TYPE("type"),
	COUNTRY("country"),
	IMAGETYPE("imagetype"),
	
	/** The Constraints. */
	DOI("doi"),
	TITLE("title"),
	ISBN("isbn"),
	ISSN("issn"),
	ORGNAME("orgname"),
	JOURNAL("journal"),
	BOOK("book"),
	NAME("name"),
	DATE("date"),
	OPENACCESS("openaccess");
	
    /** The Constant stringToEnum. */
	private static final Map<String, Facet> stringToEnum = new HashMap<String, Facet>();

	static { // Initialize map from constant name to enum constant
		for (Facet op : values()) {
			stringToEnum.put(op.value(), op);
		}
	}
	
    /** The value. */
    private final String value;
    
    /**
     * Instantiates a new blog sort order.
     * 
     * @param value the value
     */
    Facet(String value) {
        this.value = value;
    }

	@Override
	public String value() {
		return value;
	}
	
	/**
	 * From value.
	 * 
	 * @param value the value
	 * 
	 * @return the blog sort order
	 */
	public static Facet fromValue(String value) {
		return stringToEnum.get(value);
	}

}
