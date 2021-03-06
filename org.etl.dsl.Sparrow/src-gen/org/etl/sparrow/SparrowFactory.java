/**
 */
package org.etl.sparrow;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.etl.sparrow.SparrowPackage
 * @generated
 */
public interface SparrowFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SparrowFactory eINSTANCE = org.etl.sparrow.impl.SparrowFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Process</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Process</em>'.
   * @generated
   */
  Process createProcess();

  /**
   * Returns a new object of class '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Action</em>'.
   * @generated
   */
  Action createAction();

  /**
   * Returns a new object of class '<em>Copydata</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Copydata</em>'.
   * @generated
   */
  Copydata createCopydata();

  /**
   * Returns a new object of class '<em>Write Csv</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Write Csv</em>'.
   * @generated
   */
  WriteCsv createWriteCsv();

  /**
   * Returns a new object of class '<em>Load Csv</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load Csv</em>'.
   * @generated
   */
  LoadCsv createLoadCsv();

  /**
   * Returns a new object of class '<em>Executescript</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Executescript</em>'.
   * @generated
   */
  Executescript createExecutescript();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  SparrowPackage getSparrowPackage();

} //SparrowFactory
