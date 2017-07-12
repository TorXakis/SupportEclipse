/**
 * generated by Xtext 2.10.0
 */
package nl.tno.torxakis.language.torXakisDsl.impl;

import java.util.Collection;

import nl.tno.torxakis.language.torXakisDsl.Assignment;
import nl.tno.torxakis.language.torXakisDsl.TorXakisDslPackage;
import nl.tno.torxakis.language.torXakisDsl.ValExpr;
import nl.tno.torxakis.language.torXakisDsl.ValExprLet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Val Expr Let</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.ValExprLetImpl#getAssignments <em>Assignments</em>}</li>
 *   <li>{@link nl.tno.torxakis.language.torXakisDsl.impl.ValExprLetImpl#getValExpr <em>Val Expr</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValExprLetImpl extends ValExprImpl implements ValExprLet
{
  /**
   * The cached value of the '{@link #getAssignments() <em>Assignments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignments()
   * @generated
   * @ordered
   */
  protected EList<Assignment> assignments;

  /**
   * The cached value of the '{@link #getValExpr() <em>Val Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValExpr()
   * @generated
   * @ordered
   */
  protected ValExpr valExpr;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ValExprLetImpl()
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
    return TorXakisDslPackage.Literals.VAL_EXPR_LET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Assignment> getAssignments()
  {
    if (assignments == null)
    {
      assignments = new EObjectContainmentEList<Assignment>(Assignment.class, this, TorXakisDslPackage.VAL_EXPR_LET__ASSIGNMENTS);
    }
    return assignments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ValExpr getValExpr()
  {
    return valExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValExpr(ValExpr newValExpr, NotificationChain msgs)
  {
    ValExpr oldValExpr = valExpr;
    valExpr = newValExpr;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.VAL_EXPR_LET__VAL_EXPR, oldValExpr, newValExpr);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValExpr(ValExpr newValExpr)
  {
    if (newValExpr != valExpr)
    {
      NotificationChain msgs = null;
      if (valExpr != null)
        msgs = ((InternalEObject)valExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.VAL_EXPR_LET__VAL_EXPR, null, msgs);
      if (newValExpr != null)
        msgs = ((InternalEObject)newValExpr).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TorXakisDslPackage.VAL_EXPR_LET__VAL_EXPR, null, msgs);
      msgs = basicSetValExpr(newValExpr, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TorXakisDslPackage.VAL_EXPR_LET__VAL_EXPR, newValExpr, newValExpr));
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
      case TorXakisDslPackage.VAL_EXPR_LET__ASSIGNMENTS:
        return ((InternalEList<?>)getAssignments()).basicRemove(otherEnd, msgs);
      case TorXakisDslPackage.VAL_EXPR_LET__VAL_EXPR:
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
      case TorXakisDslPackage.VAL_EXPR_LET__ASSIGNMENTS:
        return getAssignments();
      case TorXakisDslPackage.VAL_EXPR_LET__VAL_EXPR:
        return getValExpr();
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
      case TorXakisDslPackage.VAL_EXPR_LET__ASSIGNMENTS:
        getAssignments().clear();
        getAssignments().addAll((Collection<? extends Assignment>)newValue);
        return;
      case TorXakisDslPackage.VAL_EXPR_LET__VAL_EXPR:
        setValExpr((ValExpr)newValue);
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
      case TorXakisDslPackage.VAL_EXPR_LET__ASSIGNMENTS:
        getAssignments().clear();
        return;
      case TorXakisDslPackage.VAL_EXPR_LET__VAL_EXPR:
        setValExpr((ValExpr)null);
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
      case TorXakisDslPackage.VAL_EXPR_LET__ASSIGNMENTS:
        return assignments != null && !assignments.isEmpty();
      case TorXakisDslPackage.VAL_EXPR_LET__VAL_EXPR:
        return valExpr != null;
    }
    return super.eIsSet(featureID);
  }

} //ValExprLetImpl