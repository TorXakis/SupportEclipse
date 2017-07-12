/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl.impl;

import java.util.Collection;

import nl.tno.torxakis.language.torXakisDsl.ChannelName;
import nl.tno.torxakis.language.torXakisDsl.ChannelOffer;
import nl.tno.torxakis.language.torXakisDsl.Communication;
import nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage;

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
 * An implementation of the model object '<em><b>Communication</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.CommunicationImpl#getChannelName <em>Channel Name</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.CommunicationImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.CommunicationImpl#getChannelOffers <em>Channel Offers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunicationImpl extends MinimalEObjectImpl.Container implements Communication
{
  /**
   * The cached value of the '{@link #getChannelName() <em>Channel Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannelName()
   * @generated
   * @ordered
   */
  protected ChannelName channelName;

  /**
   * The default value of the '{@link #getExit() <em>Exit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExit()
   * @generated
   * @ordered
   */
  protected static final String EXIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getExit() <em>Exit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExit()
   * @generated
   * @ordered
   */
  protected String exit = EXIT_EDEFAULT;

  /**
   * The cached value of the '{@link #getChannelOffers() <em>Channel Offers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChannelOffers()
   * @generated
   * @ordered
   */
  protected EList<ChannelOffer> channelOffers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CommunicationImpl()
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
    return TorXakisDslPackage.Literals.COMMUNICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ChannelName getChannelName()
  {
    return channelName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChannelName(ChannelName newChannelName, NotificationChain msgs)
  {
    ChannelName oldChannelName = channelName;
    channelName = newChannelName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.COMMUNICATION__CHANNEL_NAME, oldChannelName, newChannelName);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setChannelName(ChannelName newChannelName)
  {
    if (newChannelName != channelName)
    {
      NotificationChain msgs = null;
      if (channelName != null)
        msgs = ((InternalEObject)channelName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.COMMUNICATION__CHANNEL_NAME, null, msgs);
      if (newChannelName != null)
        msgs = ((InternalEObject)newChannelName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.COMMUNICATION__CHANNEL_NAME, null, msgs);
      msgs = basicSetChannelName(newChannelName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.COMMUNICATION__CHANNEL_NAME, newChannelName, newChannelName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getExit()
  {
    return exit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExit(String newExit)
  {
    String oldExit = exit;
    exit = newExit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.COMMUNICATION__EXIT, oldExit, exit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ChannelOffer> getChannelOffers()
  {
    if (channelOffers == null)
    {
      channelOffers = new EObjectContainmentEList<ChannelOffer>(ChannelOffer.class, this, TorXakisDslPackage.COMMUNICATION__CHANNEL_OFFERS);
    }
    return channelOffers;
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
      case TorXakisDslPackage.COMMUNICATION__CHANNEL_NAME:
        return basicSetChannelName(null, msgs);
      case TorXakisDslPackage.COMMUNICATION__CHANNEL_OFFERS:
        return ((InternalEList<?>)getChannelOffers()).basicRemove(otherEnd, msgs);
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
      case TorXakisDslPackage.COMMUNICATION__CHANNEL_NAME:
        return getChannelName();
      case TorXakisDslPackage.COMMUNICATION__EXIT:
        return getExit();
      case TorXakisDslPackage.COMMUNICATION__CHANNEL_OFFERS:
        return getChannelOffers();
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
      case TorXakisDslPackage.COMMUNICATION__CHANNEL_NAME:
        setChannelName((ChannelName)newValue);
        return;
      case TorXakisDslPackage.COMMUNICATION__EXIT:
        setExit((String)newValue);
        return;
      case TorXakisDslPackage.COMMUNICATION__CHANNEL_OFFERS:
        getChannelOffers().clear();
        getChannelOffers().addAll((Collection<? extends ChannelOffer>)newValue);
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
      case TorXakisDslPackage.COMMUNICATION__CHANNEL_NAME:
        setChannelName((ChannelName)null);
        return;
      case TorXakisDslPackage.COMMUNICATION__EXIT:
        setExit(EXIT_EDEFAULT);
        return;
      case TorXakisDslPackage.COMMUNICATION__CHANNEL_OFFERS:
        getChannelOffers().clear();
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
      case TorXakisDslPackage.COMMUNICATION__CHANNEL_NAME:
        return channelName != null;
      case TorXakisDslPackage.COMMUNICATION__EXIT:
        return EXIT_EDEFAULT == null ? exit != null : !EXIT_EDEFAULT.equals(exit);
      case TorXakisDslPackage.COMMUNICATION__CHANNEL_OFFERS:
        return channelOffers != null && !channelOffers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (exit: ");
    result.append(exit);
    result.append(')');
    return result.toString();
  }

} //CommunicationImpl