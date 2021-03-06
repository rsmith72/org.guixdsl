/**
 */
package org.guixdsl.guixdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.guixdsl.guixdsl.GuixdslPackage
 * @generated
 */
public interface GuixdslFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  GuixdslFactory eINSTANCE = org.guixdsl.guixdsl.impl.GuixdslFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Dsl Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Model</em>'.
   * @generated
   */
  DslModel createDslModel();

  /**
   * Returns a new object of class '<em>Dsl Abstract Gui Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Abstract Gui Element</em>'.
   * @generated
   */
  DslAbstractGuiElement createDslAbstractGuiElement();

  /**
   * Returns a new object of class '<em>Dsl Gui Module</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl Gui Module</em>'.
   * @generated
   */
  DslGuiModule createDslGuiModule();

  /**
   * Returns a new object of class '<em>Dsl View</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dsl View</em>'.
   * @generated
   */
  DslView createDslView();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  GuixdslPackage getGuixdslPackage();

} //GuixdslFactory
