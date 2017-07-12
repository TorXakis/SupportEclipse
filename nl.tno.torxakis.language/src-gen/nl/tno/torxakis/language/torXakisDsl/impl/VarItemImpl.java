/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl.impl;

import nl.tno.torxakis.language.torXakisDsl.NeVarsDeclarationList;
import nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage;
import nl.tno.torxakis.language.torXakisDsl.VarItem;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.VarItemImpl#getNeVarsDelarationList <em>Ne Vars Delaration List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VarItemImpl extends MinimalEObjectImpl.Container implements VarItem
{
  /**
   * The cached value of the '{@link #getNeVarsDelarationList() <em>Ne Vars Delaration List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeVarsDelarationList()
   * @generated
   * @ordered
   */
  protected NeVarsDeclarationList neVarsDelarationList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VarItemImpl()
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
    return TorXakisDslPackage.Literals.VAR_ITEM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeVarsDeclarationList getNeVarsDelarationList()
  {
    return neVarsDelarationList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNeVarsDelarationList(NeVarsDeclarationList newNeVarsDelarationList, NotificationChain msgs)
  {
    NeVarsDeclarationList oldNeVarsDelarationList = neVarsDelarationList;
    neVarsDelarationList = newNeVarsDelarationList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.VAR_ITEM__NE_VARS_DELARATION_LIST, oldNeVarsDelarationList, newNeVarsDelarationList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNeVarsDelarationList(NeVarsDeclarationList newNeVarsDelarationList)
  {
    if (newNeVarsDelarationList != neVarsDelarationList)
    {
      NotificationChain msgs = null;
      if (neVarsDelarationList != null)
        msgs = ((InternalEObject)neVarsDelarationList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.VAR_ITEM__NE_VARS_DELARATION_LIST, null, msgs);
      if (newNeVarsDelarationList != null)
        msgs = ((InternalEObject)newNeVarsDelarationList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.VAR_ITEM__NE_VARS_DELARATION_LIST, null, msgs);
      msgs = basicSetNeVarsDelarationList(newNeVarsDelarationList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.VAR_ITEM__NE_VARS_DELARATION_LIST, newNeVarsDelarationList, newNeVarsDelarationList));
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
      case TorXakisDslPackage.VAR_ITEM__NE_VARS_DELARATION_LIST:
        return basicSetNeVarsDelarationList(null, msgs);
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
      case TorXakisDslPackage.VAR_ITEM__NE_VARS_DELARATION_LIST:
        return getNeVarsDelarationList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TorXakisDslPackage.VAR_ITEM__NE_VARS_DELARATION_LIST:
        setNeVarsDelarationList((NeVarsDeclarationList)newValue);
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
      case TorXakisDslPackage.VAR_ITEM__NE_VARS_DELARATION_LIST:
        setNeVarsDelarationList((NeVarsDeclarationList)null);
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
      case TorXakisDslPackage.VAR_ITEM__NE_VARS_DELARATION_LIST:
        return neVarsDelarationList != null;
    }
    return super.eIsSet(featureID);
  }

} //VarItemImpl