/**
 */
package jsonToSql;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jsonToSql.AttributeName#getOldField <em>Old Field</em>}</li>
 *   <li>{@link jsonToSql.AttributeName#getFinalField <em>Final Field</em>}</li>
 * </ul>
 * </p>
 *
 * @see jsonToSql.JsonToSqlPackage#getAttributeName()
 * @model
 * @generated
 */
public interface AttributeName extends EObject {
	/**
	 * Returns the value of the '<em><b>Old Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Old Field</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Old Field</em>' attribute.
	 * @see #setOldField(String)
	 * @see jsonToSql.JsonToSqlPackage#getAttributeName_OldField()
	 * @model
	 * @generated
	 */
	String getOldField();

	/**
	 * Sets the value of the '{@link jsonToSql.AttributeName#getOldField <em>Old Field</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Old Field</em>' attribute.
	 * @see #getOldField()
	 * @generated
	 */
	void setOldField(String value);

	/**
	 * Returns the value of the '<em><b>Final Field</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Field</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Field</em>' reference.
	 * @see #setFinalField(Field)
	 * @see jsonToSql.JsonToSqlPackage#getAttributeName_FinalField()
	 * @model required="true"
	 * @generated
	 */
	Field getFinalField();

	/**
	 * Sets the value of the '{@link jsonToSql.AttributeName#getFinalField <em>Final Field</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Field</em>' reference.
	 * @see #getFinalField()
	 * @generated
	 */
	void setFinalField(Field value);

} // AttributeName
