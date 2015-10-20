/**
 */
package jsonToSql;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jsonToSql.Config#getConecction <em>Conecction</em>}</li>
 *   <li>{@link jsonToSql.Config#getMergeFields <em>Merge Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @see jsonToSql.JsonToSqlPackage#getConfig()
 * @model
 * @generated
 */
public interface Config extends EObject {
	/**
	 * Returns the value of the '<em><b>Conecction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conecction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conecction</em>' containment reference.
	 * @see #setConecction(Connection)
	 * @see jsonToSql.JsonToSqlPackage#getConfig_Conecction()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Connection getConecction();

	/**
	 * Sets the value of the '{@link jsonToSql.Config#getConecction <em>Conecction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conecction</em>' containment reference.
	 * @see #getConecction()
	 * @generated
	 */
	void setConecction(Connection value);

	/**
	 * Returns the value of the '<em><b>Merge Fields</b></em>' containment reference list.
	 * The list contents are of type {@link jsonToSql.MergedField}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Merge Fields</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge Fields</em>' containment reference list.
	 * @see jsonToSql.JsonToSqlPackage#getConfig_MergeFields()
	 * @model containment="true"
	 * @generated
	 */
	EList<MergedField> getMergeFields();

} // Config
