/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl.impl;

import nl.tno.torxakis.language.torXakisDsl.ModelDef;
import nl.tno.torxakis.language.torXakisDsl.ModelName;
import nl.tno.torxakis.language.torXakisDsl.NeChannelNameList;
import nl.tno.torxakis.language.torXakisDsl.ProcessBehaviour;
import nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Def</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.ModelDefImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.ModelDefImpl#getNeInputChannelNameList <em>Ne Input Channel Name List</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.ModelDefImpl#getNeOutputChannelNameList <em>Ne Output Channel Name List</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.ModelDefImpl#getProcessBehaviour <em>Process Behaviour</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelDefImpl extends MinimalEObjectImpl.Container implements ModelDef
{
  /**
   * The cached value of the '{@link #getModelName() <em>Model Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelName()
   * @generated
   * @ordered
   */
  protected ModelName modelName;

  /**
   * The cached value of the '{@link #getNeInputChannelNameList() <em>Ne Input Channel Name List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeInputChannelNameList()
   * @generated
   * @ordered
   */
  protected NeChannelNameList neInputChannelNameList;

  /**
   * The cached value of the '{@link #getNeOutputChannelNameList() <em>Ne Output Channel Name List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeOutputChannelNameList()
   * @generated
   * @ordered
   */
  protected NeChannelNameList neOutputChannelNameList;

  /**
   * The cached value of the '{@link #getProcessBehaviour() <em>Process Behaviour</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProcessBehaviour()
   * @generated
   * @ordered
   */
  protected ProcessBehaviour processBehaviour;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelDefImpl()
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
    return TorXakisDslPackage.Literals.MODEL_DEF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelName getModelName()
  {
    return modelName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetModelName(ModelName newModelName, NotificationChain msgs)
  {
    ModelName oldModelName = modelName;
    modelName = newModelName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.MODEL_DEF__MODEL_NAME, oldModelName, newModelName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelName(ModelName newModelName)
  {
    if (newModelName != modelName)
    {
      NotificationChain msgs = null;
      if (modelName != null)
        msgs = ((InternalEObject)modelName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.MODEL_DEF__MODEL_NAME, null, msgs);
      if (newModelName != null)
        msgs = ((InternalEObject)newModelName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.MODEL_DEF__MODEL_NAME, null, msgs);
      msgs = basicSetModelName(newModelName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.MODEL_DEF__MODEL_NAME, newModelName, newModelName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeChannelNameList getNeInputChannelNameList()
  {
    return neInputChannelNameList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNeInputChannelNameList(NeChannelNameList newNeInputChannelNameList, NotificationChain msgs)
  {
    NeChannelNameList oldNeInputChannelNameList = neInputChannelNameList;
    neInputChannelNameList = newNeInputChannelNameList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.MODEL_DEF__NE_INPUT_CHANNEL_NAME_LIST, oldNeInputChannelNameList, newNeInputChannelNameList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNeInputChannelNameList(NeChannelNameList newNeInputChannelNameList)
  {
    if (newNeInputChannelNameList != neInputChannelNameList)
    {
      NotificationChain msgs = null;
      if (neInputChannelNameList != null)
        msgs = ((InternalEObject)neInputChannelNameList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.MODEL_DEF__NE_INPUT_CHANNEL_NAME_LIST, null, msgs);
      if (newNeInputChannelNameList != null)
        msgs = ((InternalEObject)newNeInputChannelNameList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.MODEL_DEF__NE_INPUT_CHANNEL_NAME_LIST, null, msgs);
      msgs = basicSetNeInputChannelNameList(newNeInputChannelNameList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.MODEL_DEF__NE_INPUT_CHANNEL_NAME_LIST, newNeInputChannelNameList, newNeInputChannelNameList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NeChannelNameList getNeOutputChannelNameList()
  {
    return neOutputChannelNameList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNeOutputChannelNameList(NeChannelNameList newNeOutputChannelNameList, NotificationChain msgs)
  {
    NeChannelNameList oldNeOutputChannelNameList = neOutputChannelNameList;
    neOutputChannelNameList = newNeOutputChannelNameList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.MODEL_DEF__NE_OUTPUT_CHANNEL_NAME_LIST, oldNeOutputChannelNameList, newNeOutputChannelNameList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNeOutputChannelNameList(NeChannelNameList newNeOutputChannelNameList)
  {
    if (newNeOutputChannelNameList != neOutputChannelNameList)
    {
      NotificationChain msgs = null;
      if (neOutputChannelNameList != null)
        msgs = ((InternalEObject)neOutputChannelNameList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.MODEL_DEF__NE_OUTPUT_CHANNEL_NAME_LIST, null, msgs);
      if (newNeOutputChannelNameList != null)
        msgs = ((InternalEObject)newNeOutputChannelNameList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.MODEL_DEF__NE_OUTPUT_CHANNEL_NAME_LIST, null, msgs);
      msgs = basicSetNeOutputChannelNameList(newNeOutputChannelNameList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.MODEL_DEF__NE_OUTPUT_CHANNEL_NAME_LIST, newNeOutputChannelNameList, newNeOutputChannelNameList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ProcessBehaviour getProcessBehaviour()
  {
    return processBehaviour;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetProcessBehaviour(ProcessBehaviour newProcessBehaviour, NotificationChain msgs)
  {
    ProcessBehaviour oldProcessBehaviour = processBehaviour;
    processBehaviour = newProcessBehaviour;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.MODEL_DEF__PROCESS_BEHAVIOUR, oldProcessBehaviour, newProcessBehaviour);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProcessBehaviour(ProcessBehaviour newProcessBehaviour)
  {
    if (newProcessBehaviour != processBehaviour)
    {
      NotificationChain msgs = null;
      if (processBehaviour != null)
        msgs = ((InternalEObject)processBehaviour).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.MODEL_DEF__PROCESS_BEHAVIOUR, null, msgs);
      if (newProcessBehaviour != null)
        msgs = ((InternalEObject)newProcessBehaviour).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.MODEL_DEF__PROCESS_BEHAVIOUR, null, msgs);
      msgs = basicSetProcessBehaviour(newProcessBehaviour, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.MODEL_DEF__PROCESS_BEHAVIOUR, newProcessBehaviour, newProcessBehaviour));
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
      case TorXakisDslPackage.MODEL_DEF__MODEL_NAME:
        return basicSetModelName(null, msgs);
      case TorXakisDslPackage.MODEL_DEF__NE_INPUT_CHANNEL_NAME_LIST:
        return basicSetNeInputChannelNameList(null, msgs);
      case TorXakisDslPackage.MODEL_DEF__NE_OUTPUT_CHANNEL_NAME_LIST:
        return basicSetNeOutputChannelNameList(null, msgs);
      case TorXakisDslPackage.MODEL_DEF__PROCESS_BEHAVIOUR:
        return basicSetProcessBehaviour(null, msgs);
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
      case TorXakisDslPackage.MODEL_DEF__MODEL_NAME:
        return getModelName();
      case TorXakisDslPackage.MODEL_DEF__NE_INPUT_CHANNEL_NAME_LIST:
        return getNeInputChannelNameList();
      case TorXakisDslPackage.MODEL_DEF__NE_OUTPUT_CHANNEL_NAME_LIST:
        return getNeOutputChannelNameList();
      case TorXakisDslPackage.MODEL_DEF__PROCESS_BEHAVIOUR:
        return getProcessBehaviour();
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
      case TorXakisDslPackage.MODEL_DEF__MODEL_NAME:
        setModelName((ModelName)newValue);
        return;
      case TorXakisDslPackage.MODEL_DEF__NE_INPUT_CHANNEL_NAME_LIST:
        setNeInputChannelNameList((NeChannelNameList)newValue);
        return;
      case TorXakisDslPackage.MODEL_DEF__NE_OUTPUT_CHANNEL_NAME_LIST:
        setNeOutputChannelNameList((NeChannelNameList)newValue);
        return;
      case TorXakisDslPackage.MODEL_DEF__PROCESS_BEHAVIOUR:
        setProcessBehaviour((ProcessBehaviour)newValue);
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
      case TorXakisDslPackage.MODEL_DEF__MODEL_NAME:
        setModelName((ModelName)null);
        return;
      case TorXakisDslPackage.MODEL_DEF__NE_INPUT_CHANNEL_NAME_LIST:
        setNeInputChannelNameList((NeChannelNameList)null);
        return;
      case TorXakisDslPackage.MODEL_DEF__NE_OUTPUT_CHANNEL_NAME_LIST:
        setNeOutputChannelNameList((NeChannelNameList)null);
        return;
      case TorXakisDslPackage.MODEL_DEF__PROCESS_BEHAVIOUR:
        setProcessBehaviour((ProcessBehaviour)null);
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
      case TorXakisDslPackage.MODEL_DEF__MODEL_NAME:
        return modelName != null;
      case TorXakisDslPackage.MODEL_DEF__NE_INPUT_CHANNEL_NAME_LIST:
        return neInputChannelNameList != null;
      case TorXakisDslPackage.MODEL_DEF__NE_OUTPUT_CHANNEL_NAME_LIST:
        return neOutputChannelNameList != null;
      case TorXakisDslPackage.MODEL_DEF__PROCESS_BEHAVIOUR:
        return processBehaviour != null;
    }
    return super.eIsSet(featureID);
  }

} //ModelDefImpl