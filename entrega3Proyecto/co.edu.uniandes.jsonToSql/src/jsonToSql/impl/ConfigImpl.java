/**
 */
package jsonToSql.impl;

import java.util.Collection;

import jsonToSql.Config;
import jsonToSql.Connection;
import jsonToSql.JsonToSqlPackage;
import jsonToSql.MergedField;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Config</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jsonToSql.impl.ConfigImpl#getConecction <em>Conecction</em>}</li>
 *   <li>{@link jsonToSql.impl.ConfigImpl#getMergeFields <em>Merge Fields</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConfigImpl extends MinimalEObjectImpl.Container implements Config {
	/**
	 * The cached value of the '{@link #getConecction() <em>Conecction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConecction()
	 * @generated
	 * @ordered
	 */
	protected Connection conecction;

	/**
	 * The cached value of the '{@link #getMergeFields() <em>Merge Fields</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMergeFields()
	 * @generated
	 * @ordered
	 */
	protected EList<MergedField> mergeFields;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JsonToSqlPackage.Literals.CONFIG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getConecction() {
		return conecction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConecction(Connection newConecction, NotificationChain msgs) {
		Connection oldConecction = conecction;
		conecction = newConecction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JsonToSqlPackage.CONFIG__CONECCTION, oldConecction, newConecction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConecction(Connection newConecction) {
		if (newConecction != conecction) {
			NotificationChain msgs = null;
			if (conecction != null)
				msgs = ((InternalEObject)conecction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JsonToSqlPackage.CONFIG__CONECCTION, null, msgs);
			if (newConecction != null)
				msgs = ((InternalEObject)newConecction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JsonToSqlPackage.CONFIG__CONECCTION, null, msgs);
			msgs = basicSetConecction(newConecction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JsonToSqlPackage.CONFIG__CONECCTION, newConecction, newConecction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MergedField> getMergeFields() {
		if (mergeFields == null) {
			mergeFields = new EObjectContainmentEList<MergedField>(MergedField.class, this, JsonToSqlPackage.CONFIG__MERGE_FIELDS);
		}
		return mergeFields;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JsonToSqlPackage.CONFIG__CONECCTION:
				return basicSetConecction(null, msgs);
			case JsonToSqlPackage.CONFIG__MERGE_FIELDS:
				return ((InternalEList<?>)getMergeFields()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JsonToSqlPackage.CONFIG__CONECCTION:
				return getConecction();
			case JsonToSqlPackage.CONFIG__MERGE_FIELDS:
				return getMergeFields();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JsonToSqlPackage.CONFIG__CONECCTION:
				setConecction((Connection)newValue);
				return;
			case JsonToSqlPackage.CONFIG__MERGE_FIELDS:
				getMergeFields().clear();
				getMergeFields().addAll((Collection<? extends MergedField>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JsonToSqlPackage.CONFIG__CONECCTION:
				setConecction((Connection)null);
				return;
			case JsonToSqlPackage.CONFIG__MERGE_FIELDS:
				getMergeFields().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JsonToSqlPackage.CONFIG__CONECCTION:
				return conecction != null;
			case JsonToSqlPackage.CONFIG__MERGE_FIELDS:
				return mergeFields != null && !mergeFields.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigImpl
