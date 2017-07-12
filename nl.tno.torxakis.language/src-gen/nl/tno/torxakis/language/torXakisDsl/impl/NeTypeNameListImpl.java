/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl.impl;

import java.util.Collection;

import nl.tno.torxakis.language.torXakisDsl.NeTypeNameList;
import nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage;
import nl.tno.torxakis.language.torXakisDsl.TypeName;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ne Type Name List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.NeTypeNameListImpl#getTypeNames <em>Type Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NeTypeNameListImpl extends MinimalEObjectImpl.Container implements NeTypeNameList
{
  /**
   * The cached value of the '{@link #getTypeNames() <em>Type Names</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTypeNames()
   * @generated
   * @ordered
   */
  protected EList<TypeName> typeNames;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NeTypeNameListImpl()
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
    return TorXakisDslPackage.Literals.NE_TYPE_NAME_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TypeName> getTypeNames()
  {
    if (typeNames == null)
    {
      typeNames = new EObjectContainmentEList<TypeName>(TypeName.class, this, TorXakisDslPackage.NE_TYPE_NAME_LIST__TYPE_NAMES);
    }
    return typeNames;
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
      case TorXakisDslPackage.NE_TYPE_NAME_LIST__TYPE_NAMES:
        return ((InternalEList<?>)getTypeNames()).basicRemove(otherEnd, msgs);
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
      case TorXakisDslPackage.NE_TYPE_NAME_LIST__TYPE_NAMES:
        return getTypeNames();
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
      case TorXakisDslPackage.NE_TYPE_NAME_LIST__TYPE_NAMES:
        getTypeNames().clear();
        getTypeNames().addAll((Collection<? extends TypeName>)newValue);
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
      case TorXakisDslPackage.NE_TYPE_NAME_LIST__TYPE_NAMES:
        getTypeNames().clear();
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
      case TorXakisDslPackage.NE_TYPE_NAME_LIST__TYPE_NAMES:
        return typeNames != null && !typeNames.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NeTypeNameListImpl