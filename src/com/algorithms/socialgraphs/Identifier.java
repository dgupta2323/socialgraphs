package com.algorithms.socialgraphs;

import java.io.Serializable;

// TODO: Auto-generated Javadoc
/**
 * The Class Identifier.
 */
public class Identifier implements Serializable
{
	/**
     *
     */
	private static final long serialVersionUID = -1939224859778446320L;

	// == generates unique hash for person
	private Integer code;

	/**
	 * Instantiates a new identifier.
	 */
	private Identifier(Integer code)
	{
		this.code = code;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = (prime * result) + ((code == null) ? 0 : code.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}

		if (getClass() != obj.getClass()) {
			return false;
		}

		Identifier other = (Identifier) obj;

		if (code == null) {
			if (other.code != null) {
				return false;
			}
		} else if (!code.equals(other.code)) {
			return false;
		}

		return true;
	}

	/**
	 * Gets the unique identification.
	 * 
	 * @param person
	 *            the person
	 * @return the unique identification
	 */
	public static Identifier getUniqueIdentification(Person person)
	{
		int h = person.hashCode();
		h ^= ((h >>> 20) ^ (h >>> 12));

		return new Identifier(h);
	}
}
