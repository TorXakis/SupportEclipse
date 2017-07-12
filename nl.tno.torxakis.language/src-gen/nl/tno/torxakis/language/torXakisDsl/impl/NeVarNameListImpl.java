/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl.impl;

import java.util.Collection;

import nl.tno.torxakis.language.torXakisDsl.NeVarNameList;
import nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage;
import nl.tno.torxakis.language.torXakisDsl.VarName;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ne Var Name List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.NeVarNameListImpl#getVarNames <em>Var Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeVarNameListImpl extends MinimalEObjectImpl.Container implements NeVarNameList
{
  /**
   * The cached value of the '{@link #getVarNames() <em>Var Names</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVarNames()
   * @generated
   * @ordered
   */
  protected EList<VarName> varNames;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NeVarNameListImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TorXakisDslPackage.Literals.NE_VAR_NAME_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VarName> getVarNames()
  {
    if (varNames == null)
    {
      varNames = new EObjectContainmentEList<VarName>(VarName.class, this, TorXakisDslPackage.NE_VAR_NAME_LIST__VAR_NAMES);
    }
    return varNames;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TorXakisDslPackage.NE_VAR_NAME_LIST__VAR_NAMES:
        return ((InternalEList<?>)getVarNames()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TorXakisDslPackage.NE_VAR_NAME_LIST__VAR_NAMES:
        return getVarNames();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TorXakisDslPackage.NE_VAR_NAME_LIST__VAR_NAMES:
        getVarNames().clear();
        getVarNames().addAll((Collection<? extends VarName>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TorXakisDslPackage.NE_VAR_NAME_LIST__VAR_NAMES:
        getVarNames().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TorXakisDslPackage.NE_VAR_NAME_LIST__VAR_NAMES:
        return varNames != null && !varNames.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NeVarNameListImpl