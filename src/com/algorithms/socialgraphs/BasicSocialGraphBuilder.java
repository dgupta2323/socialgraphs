package com.algorithms.socialgraphs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

// TODO: Auto-generated Javadoc
/**
 * The Class BasicSocialGraphBuilder.
 *
 * @author dgupta
 * @since 2011/11/27 : On my flight to Chicago from San Francisco !!
 * @version 1.0
 */

/**
 * 
 * Creates a basic Social Graph and facilitates
 * adding of new nodes in Graph Stores the entire
 * node structure in memory
 * 
 * 
 * 
 */
public class BasicSocialGraphBuilder
{
	/** The Constant MAX_NODES. */
	private static final int MAX_NODES = 1000;

	// == Node Container
	private static Map<Identifier, Person> nodeContainer = new HashMap<Identifier, Person>();

	// ==position in relationship Matrix
	private static Map<Integer, Identifier> mPosition = new HashMap<Integer, Identifier>();

	/** The adj matrix. */
	private int[][] adjMatrix = new int[MAX_NODES][MAX_NODES];

	/**
	 * Instantiates a new basic social graph
	 * builder.
	 */
	public BasicSocialGraphBuilder()
	{
		for (int i = 0; i < adjMatrix.length; i++) {
			for (int j = 0; j < adjMatrix[i].length; j++) {
				adjMatrix[i][j] = 0;
			}
		}
	}

	/**
	 * Builds the graph.
	 */
	private static void buildGraph(Person p)
	{
		Identifier identifier = Identifier.getUniqueIdentification(p);
		synchronized (BasicSocialGraphBuilder.class) {
			nodeContainer.put(identifier, p);
			
		}
	}

	/**
	 * Adds the person to social network.
	 * 
	 * @param p1
	 *            the p1
	 */
	public static void addPersonToSocialNetwork(Person p1)
	{
		// First call to initialize person inside
		// social network hierarchy
		buildGraph(p1);
	}

	/**
	 * Builds the individual relation ships.
	 * 
	 * @param p1
	 *            the p1
	 * @param p2
	 *            the p2
	 */
	public static void buildIndividualRelationShips(Person p1, Person p2)
	{
	}

	/**
	 * Builds the mass relation ships.
	 * 
	 * @param p1
	 *            the p1
	 * @param p2
	 *            the p2
	 */
	public static void buildMassRelationShips(Person p1, List<Person> p2)
	{
	}

	/**
	 * Find if direct relation ship exists.
	 * 
	 * @param p1
	 *            the p1
	 * @param p2
	 *            the p2
	 * @return true, if successful
	 */
	public static boolean findIfDirectRelationShipExists(Person p1, Person p2)
	{
		return true;
	}

	/**
	 * Find shortest depth of relation ship.
	 * 
	 * @param p1
	 *            the p1
	 * @param p2
	 *            the p2
	 * @return the int
	 */
	public static int findShortestDepthOfRelationShip(Person p1, Person p2)
	{
		return 1;
	}

	/**
	 * Find shortest path relation ship.
	 * 
	 * @param p1
	 *            the p1
	 * @param p2
	 *            the p2
	 * @return the string
	 */
	public static String findShortestPathRelationShip(Person p1, Person p2)
	{
		return "";
	}

	/**
	 * Find all paths of relation ship.
	 * 
	 * @param p1
	 *            the p1
	 * @param p2
	 *            the p2
	 * @return the string[]
	 */
	public static String[] findAllPathsOfRelationShip(Person p1, Person p2)
	{
		return null;
	}
}
