/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl.impl;

import nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage;
import nl.tno.torxakis.language.torXakisDsl.ValExpr2;
import nl.tno.torxakis.language.torXakisDsl.ValExprUnaryOperator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Val Expr Unary Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.ValExprUnaryOperatorImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.ValExprUnaryOperatorImpl#getValExpr <em>Val Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValExprUnaryOperatorImpl extends ValExpr2Impl implements ValExprUnaryOperator
{
  /**
   * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected static final String OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOperator()
   * @generated
   * @ordered
   */
  protected String operator = OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getValExpr() <em>Val Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValExpr()
   * @generated
   * @ordered
   */
  protected ValExpr2 valExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValExprUnaryOperatorImpl()
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
    return TorXakisDslPackage.Literals.VAL_EXPR_UNARY_OPERATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOperator()
  {
    return operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOperator(String newOperator)
  {
    String oldOperator = operator;
    operator = newOperator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.VAL_EXPR_UNARY_OPERATOR__OPERATOR, oldOperator, operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValExpr2 getValExpr()
  {
    return valExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValExpr(ValExpr2 newValExpr, NotificationChain msgs)
  {
    ValExpr2 oldValExpr = valExpr;
    valExpr = newValExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.VAL_EXPR_UNARY_OPERATOR__VAL_EXPR, oldValExpr, newValExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValExpr(ValExpr2 newValExpr)
  {
    if (newValExpr != valExpr)
    {
      NotificationChain msgs = null;
      if (valExpr != null)
        msgs = ((InternalEObject)valExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.VAL_EXPR_UNARY_OPERATOR__VAL_EXPR, null, msgs);
      if (newValExpr != null)
        msgs = ((InternalEObject)newValExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.VAL_EXPR_UNARY_OPERATOR__VAL_EXPR, null, msgs);
      msgs = basicSetValExpr(newValExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.VAL_EXPR_UNARY_OPERATOR__VAL_EXPR, newValExpr, newValExpr));
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
      case TorXakisDslPackage.VAL_EXPR_UNARY_OPERATOR__VAL_EXPR:
        return basicSetValExpr(null, msgs);
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
      case TorXakisDslPackage.VAL_EXPR_UNARY_OPERATOR__OPERATOR:
        return getOperator();
      case TorXakisDslPackage.VAL_EXPR_UNARY_OPERATOR__VAL_EXPR:
        return getValExpr();
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
      case TorXakisDslPackage.VAL_EXPR_UNARY_OPERATOR__OPERATOR:
        setOperator((String)newValue);
        return;
      case TorXakisDslPackage.VAL_EXPR_UNARY_OPERATOR__VAL_EXPR:
        setValExpr((ValExpr2)newValue);
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
      case TorXakisDslPackage.VAL_EXPR_UNARY_OPERATOR__OPERATOR:
        setOperator(OPERATOR_EDEFAULT);
        return;
      case TorXakisDslPackage.VAL_EXPR_UNARY_OPERATOR__VAL_EXPR:
        setValExpr((ValExpr2)null);
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
      case TorXakisDslPackage.VAL_EXPR_UNARY_OPERATOR__OPERATOR:
        return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
      case TorXakisDslPackage.VAL_EXPR_UNARY_OPERATOR__VAL_EXPR:
        return valExpr != null;
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
    result.append(" (operator: ");
    result.append(operator);
    result.append(')');
    return result.toString();
  }

} //ValExprUnaryOperatorImpl