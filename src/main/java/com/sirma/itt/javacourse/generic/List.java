package src.main.java.com.sirma.itt.javacourse.generic;

/**
 * 
 * The list of nodes with type variables.
 * 
 * @author Nikolay Ch
 * 
 */
public class List {

	private int count = 0;

	public Nodes r;// the root of the list or the begin

	/**
	 * Constructor for the class.
	 */
	public List() {
		r = null;
	}

	/**
	 * The root of the tree gets the value of the updated node by the recursive
	 * method.
	 * 
	 * @param name
	 *            type variable value
	 */
	public void insert(Entry<String> name) {

		r = insert(r, name);
	}

	/**
	 * Inserts new node to the list.
	 * 
	 * @param current
	 *            the current node
	 * @param name
	 *            the new value
	 * @return the updated node
	 */
	public Nodes insert(Nodes current, Entry<String> name) {
		count++;
		if (current == null) {
			current = new Nodes();
			current.setInfo(name);
			current.setChild(null);
			System.out.println(count + " : " + name);
			count = 0;

		} else {
			current.setChild(insert(current.getChild(), name));
		}

		return current;
	}

	/**
	 * 
	 * Calls the recursive method.
	 * 
	 */
	public void visit() {
		visit(r);
	}

	/**
	 * Visits all the nodes.
	 * 
	 * @param current
	 *            the current node we are visiting
	 */
	public void visit(Nodes current) {
		count++;
		if (current == null) {
			count = 0;
			return;
		}
		System.out.println(count + " : " + current.getInfo().toString());
		visit(current.getChild());
		return;
	}
}
