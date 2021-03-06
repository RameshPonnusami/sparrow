/**
 */
package org.etl.sparrow;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.etl.sparrow.SparrowFactory
 * @model kind="package"
 * @generated
 */
public interface SparrowPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sparrow";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.Sparrow";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sparrow";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SparrowPackage eINSTANCE = org.etl.sparrow.impl.SparrowPackageImpl.init();

  /**
   * The meta object id for the '{@link org.etl.sparrow.impl.ProcessImpl <em>Process</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.etl.sparrow.impl.ProcessImpl
   * @see org.etl.sparrow.impl.SparrowPackageImpl#getProcess()
   * @generated
   */
  int PROCESS = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__NAME = 0;

  /**
   * The feature id for the '<em><b>Action</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS__ACTION = 1;

  /**
   * The number of structural features of the '<em>Process</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROCESS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.etl.sparrow.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.etl.sparrow.impl.ActionImpl
   * @see org.etl.sparrow.impl.SparrowPackageImpl#getAction()
   * @generated
   */
  int ACTION = 1;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.etl.sparrow.impl.CopydataImpl <em>Copydata</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.etl.sparrow.impl.CopydataImpl
   * @see org.etl.sparrow.impl.SparrowPackageImpl#getCopydata()
   * @generated
   */
  int COPYDATA = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COPYDATA__VALUE = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Copydata</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COPYDATA_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.etl.sparrow.impl.WriteCsvImpl <em>Write Csv</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.etl.sparrow.impl.WriteCsvImpl
   * @see org.etl.sparrow.impl.SparrowPackageImpl#getWriteCsv()
   * @generated
   */
  int WRITE_CSV = 3;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_CSV__VALUE = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Write Csv</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WRITE_CSV_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.etl.sparrow.impl.LoadCsvImpl <em>Load Csv</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.etl.sparrow.impl.LoadCsvImpl
   * @see org.etl.sparrow.impl.SparrowPackageImpl#getLoadCsv()
   * @generated
   */
  int LOAD_CSV = 4;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_CSV__VALUE = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Load Csv</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LOAD_CSV_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.etl.sparrow.impl.ExecutescriptImpl <em>Executescript</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.etl.sparrow.impl.ExecutescriptImpl
   * @see org.etl.sparrow.impl.SparrowPackageImpl#getExecutescript()
   * @generated
   */
  int EXECUTESCRIPT = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTESCRIPT__VALUE = ACTION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Executescript</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTESCRIPT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.etl.sparrow.Process <em>Process</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Process</em>'.
   * @see org.etl.sparrow.Process
   * @generated
   */
  EClass getProcess();

  /**
   * Returns the meta object for the attribute '{@link org.etl.sparrow.Process#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.etl.sparrow.Process#getName()
   * @see #getProcess()
   * @generated
   */
  EAttribute getProcess_Name();

  /**
   * Returns the meta object for the containment reference list '{@link org.etl.sparrow.Process#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Action</em>'.
   * @see org.etl.sparrow.Process#getAction()
   * @see #getProcess()
   * @generated
   */
  EReference getProcess_Action();

  /**
   * Returns the meta object for class '{@link org.etl.sparrow.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see org.etl.sparrow.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for class '{@link org.etl.sparrow.Copydata <em>Copydata</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Copydata</em>'.
   * @see org.etl.sparrow.Copydata
   * @generated
   */
  EClass getCopydata();

  /**
   * Returns the meta object for the attribute '{@link org.etl.sparrow.Copydata#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.etl.sparrow.Copydata#getValue()
   * @see #getCopydata()
   * @generated
   */
  EAttribute getCopydata_Value();

  /**
   * Returns the meta object for class '{@link org.etl.sparrow.WriteCsv <em>Write Csv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Write Csv</em>'.
   * @see org.etl.sparrow.WriteCsv
   * @generated
   */
  EClass getWriteCsv();

  /**
   * Returns the meta object for the attribute '{@link org.etl.sparrow.WriteCsv#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.etl.sparrow.WriteCsv#getValue()
   * @see #getWriteCsv()
   * @generated
   */
  EAttribute getWriteCsv_Value();

  /**
   * Returns the meta object for class '{@link org.etl.sparrow.LoadCsv <em>Load Csv</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Load Csv</em>'.
   * @see org.etl.sparrow.LoadCsv
   * @generated
   */
  EClass getLoadCsv();

  /**
   * Returns the meta object for the attribute '{@link org.etl.sparrow.LoadCsv#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.etl.sparrow.LoadCsv#getValue()
   * @see #getLoadCsv()
   * @generated
   */
  EAttribute getLoadCsv_Value();

  /**
   * Returns the meta object for class '{@link org.etl.sparrow.Executescript <em>Executescript</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Executescript</em>'.
   * @see org.etl.sparrow.Executescript
   * @generated
   */
  EClass getExecutescript();

  /**
   * Returns the meta object for the attribute list '{@link org.etl.sparrow.Executescript#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Value</em>'.
   * @see org.etl.sparrow.Executescript#getValue()
   * @see #getExecutescript()
   * @generated
   */
  EAttribute getExecutescript_Value();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SparrowFactory getSparrowFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.etl.sparrow.impl.ProcessImpl <em>Process</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.etl.sparrow.impl.ProcessImpl
     * @see org.etl.sparrow.impl.SparrowPackageImpl#getProcess()
     * @generated
     */
    EClass PROCESS = eINSTANCE.getProcess();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROCESS__NAME = eINSTANCE.getProcess_Name();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROCESS__ACTION = eINSTANCE.getProcess_Action();

    /**
     * The meta object literal for the '{@link org.etl.sparrow.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.etl.sparrow.impl.ActionImpl
     * @see org.etl.sparrow.impl.SparrowPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '{@link org.etl.sparrow.impl.CopydataImpl <em>Copydata</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.etl.sparrow.impl.CopydataImpl
     * @see org.etl.sparrow.impl.SparrowPackageImpl#getCopydata()
     * @generated
     */
    EClass COPYDATA = eINSTANCE.getCopydata();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COPYDATA__VALUE = eINSTANCE.getCopydata_Value();

    /**
     * The meta object literal for the '{@link org.etl.sparrow.impl.WriteCsvImpl <em>Write Csv</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.etl.sparrow.impl.WriteCsvImpl
     * @see org.etl.sparrow.impl.SparrowPackageImpl#getWriteCsv()
     * @generated
     */
    EClass WRITE_CSV = eINSTANCE.getWriteCsv();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WRITE_CSV__VALUE = eINSTANCE.getWriteCsv_Value();

    /**
     * The meta object literal for the '{@link org.etl.sparrow.impl.LoadCsvImpl <em>Load Csv</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.etl.sparrow.impl.LoadCsvImpl
     * @see org.etl.sparrow.impl.SparrowPackageImpl#getLoadCsv()
     * @generated
     */
    EClass LOAD_CSV = eINSTANCE.getLoadCsv();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LOAD_CSV__VALUE = eINSTANCE.getLoadCsv_Value();

    /**
     * The meta object literal for the '{@link org.etl.sparrow.impl.ExecutescriptImpl <em>Executescript</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.etl.sparrow.impl.ExecutescriptImpl
     * @see org.etl.sparrow.impl.SparrowPackageImpl#getExecutescript()
     * @generated
     */
    EClass EXECUTESCRIPT = eINSTANCE.getExecutescript();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXECUTESCRIPT__VALUE = eINSTANCE.getExecutescript_Value();

  }

} //SparrowPackage
