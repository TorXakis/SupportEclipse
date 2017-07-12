/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl.impl;

import nl.tno.torxakis.language.torXakisDsl.NeChannelNameList;
import nl.tno.torxakis.language.torXakisDsl.NeValExprList;
import nl.tno.torxakis.language.torXakisDsl.ProcCall;
import nl.tno.torxakis.language.torXakisDsl.ProcName;
import nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proc Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.ProcCallImpl#getName <em>Name</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.ProcCallImpl#getNeChannelNameList <em>Ne Channel Name List</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.ProcCallImpl#getNeValExprList <em>Ne Val Expr List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProcCallImpl extends ProcessBehaviourImpl implements ProcCall
{
  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected ProcName name;

  /**
   * The cached value of the '{@link #getNeChannelNameList() <em>Ne Channel Name List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeChannelNameList()
   * @generated
   * @ordered
   */
  protected NeChannelNameList neChannelNameList;

  /**
   * The cached value of the '{@link #getNeValExprList() <em>Ne Val Expr List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeValExprList()
   * @generated
   * @ordered
   */
  protected NeValExprList neValExprList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcCallImpl()
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
    return TorXakisDslPackage.Literals.PROC_CALL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcName getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetName(ProcName newName, NotificationChain msgs)
  {
    ProcName oldName = name;
    name = newName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.PROC_CALL__NAME, oldName, newName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(ProcName newName)
  {
    if (newName != name)
    {
      NotificationChain msgs = null;
      if (name != null)
        msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.PROC_CALL__NAME, null, msgs);
      if (newName != null)
        msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.PROC_CALL__NAME, null, msgs);
      msgs = basicSetName(newName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.PROC_CALL__NAME, newName, newName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeChannelNameList getNeChannelNameList()
  {
    return neChannelNameList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNeChannelNameList(NeChannelNameList newNeChannelNameList, NotificationChain msgs)
  {
    NeChannelNameList oldNeChannelNameList = neChannelNameList;
    neChannelNameList = newNeChannelNameList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.PROC_CALL__NE_CHANNEL_NAME_LIST, oldNeChannelNameList, newNeChannelNameList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNeChannelNameList(NeChannelNameList newNeChannelNameList)
  {
    if (newNeChannelNameList != neChannelNameList)
    {
      NotificationChain msgs = null;
      if (neChannelNameList != null)
        msgs = ((InternalEObject)neChannelNameList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.PROC_CALL__NE_CHANNEL_NAME_LIST, null, msgs);
      if (newNeChannelNameList != null)
        msgs = ((InternalEObject)newNeChannelNameList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.PROC_CALL__NE_CHANNEL_NAME_LIST, null, msgs);
      msgs = basicSetNeChannelNameList(newNeChannelNameList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.PROC_CALL__NE_CHANNEL_NAME_LIST, newNeChannelNameList, newNeChannelNameList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeValExprList getNeValExprList()
  {
    return neValExprList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNeValExprList(NeValExprList newNeValExprList, NotificationChain msgs)
  {
    NeValExprList oldNeValExprList = neValExprList;
    neValExprList = newNeValExprList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.PROC_CALL__NE_VAL_EXPR_LIST, oldNeValExprList, newNeValExprList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNeValExprList(NeValExprList newNeValExprList)
  {
    if (newNeValExprList != neValExprList)
    {
      NotificationChain msgs = null;
      if (neValExprList != null)
        msgs = ((InternalEObject)neValExprList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.PROC_CALL__NE_VAL_EXPR_LIST, null, msgs);
      if (newNeValExprList != null)
        msgs = ((InternalEObject)newNeValExprList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.PROC_CALL__NE_VAL_EXPR_LIST, null, msgs);
      msgs = basicSetNeValExprList(newNeValExprList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.PROC_CALL__NE_VAL_EXPR_LIST, newNeValExprList, newNeValExprList));
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
      case TorXakisDslPackage.PROC_CALL__NAME:
        return basicSetName(null, msgs);
      case TorXakisDslPackage.PROC_CALL__NE_CHANNEL_NAME_LIST:
        return basicSetNeChannelNameList(null, msgs);
      case TorXakisDslPackage.PROC_CALL__NE_VAL_EXPR_LIST:
        return basicSetNeValExprList(null, msgs);
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
      case TorXakisDslPackage.PROC_CALL__NAME:
        return getName();
      case TorXakisDslPackage.PROC_CALL__NE_CHANNEL_NAME_LIST:
        return getNeChannelNameList();
      case TorXakisDslPackage.PROC_CALL__NE_VAL_EXPR_LIST:
        return getNeValExprList();
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
      case TorXakisDslPackage.PROC_CALL__NAME:
        setName((ProcName)newValue);
        return;
      case TorXakisDslPackage.PROC_CALL__NE_CHANNEL_NAME_LIST:
        setNeChannelNameList((NeChannelNameList)newValue);
        return;
      case TorXakisDslPackage.PROC_CALL__NE_VAL_EXPR_LIST:
        setNeValExprList((NeValExprList)newValue);
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
      case TorXakisDslPackage.PROC_CALL__NAME:
        setName((ProcName)null);
        return;
      case TorXakisDslPackage.PROC_CALL__NE_CHANNEL_NAME_LIST:
        setNeChannelNameList((NeChannelNameList)null);
        return;
      case TorXakisDslPackage.PROC_CALL__NE_VAL_EXPR_LIST:
        setNeValExprList((NeValExprList)null);
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
      case TorXakisDslPackage.PROC_CALL__NAME:
        return name != null;
      case TorXakisDslPackage.PROC_CALL__NE_CHANNEL_NAME_LIST:
        return neChannelNameList != null;
      case TorXakisDslPackage.PROC_CALL__NE_VAL_EXPR_LIST:
        return neValExprList != null;
    }
    return super.eIsSet(featureID);
  }

} //ProcCallImpl