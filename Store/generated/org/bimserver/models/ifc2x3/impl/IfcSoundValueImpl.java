/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.models.ifc2x3.impl;

import org.bimserver.models.ifc2x3.Ifc2x3Package;
import org.bimserver.models.ifc2x3.IfcDerivedMeasureValue;
import org.bimserver.models.ifc2x3.IfcSoundValue;
import org.bimserver.models.ifc2x3.IfcTimeSeries;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Sound Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcSoundValueImpl#getSoundLevelTimeSeries <em>Sound Level Time Series</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcSoundValueImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcSoundValueImpl#getFrequencyAsString <em>Frequency As String</em>}</li>
 *   <li>{@link org.bimserver.models.ifc2x3.impl.IfcSoundValueImpl#getSoundLevelSingleValue <em>Sound Level Single Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcSoundValueImpl extends IfcPropertySetDefinitionImpl implements IfcSoundValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSoundValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3Package.eINSTANCE.getIfcSoundValue();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcTimeSeries getSoundLevelTimeSeries() {
		return (IfcTimeSeries)eGet(Ifc2x3Package.eINSTANCE.getIfcSoundValue_SoundLevelTimeSeries(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoundLevelTimeSeries(IfcTimeSeries newSoundLevelTimeSeries) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSoundValue_SoundLevelTimeSeries(), newSoundLevelTimeSeries);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSoundLevelTimeSeries() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSoundValue_SoundLevelTimeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSoundLevelTimeSeries() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSoundValue_SoundLevelTimeSeries());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFrequency() {
		return (Float)eGet(Ifc2x3Package.eINSTANCE.getIfcSoundValue_Frequency(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequency(float newFrequency) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSoundValue_Frequency(), newFrequency);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFrequencyAsString() {
		return (String)eGet(Ifc2x3Package.eINSTANCE.getIfcSoundValue_FrequencyAsString(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrequencyAsString(String newFrequencyAsString) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSoundValue_FrequencyAsString(), newFrequencyAsString);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcDerivedMeasureValue getSoundLevelSingleValue() {
		return (IfcDerivedMeasureValue)eGet(Ifc2x3Package.eINSTANCE.getIfcSoundValue_SoundLevelSingleValue(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoundLevelSingleValue(IfcDerivedMeasureValue newSoundLevelSingleValue) {
		eSet(Ifc2x3Package.eINSTANCE.getIfcSoundValue_SoundLevelSingleValue(), newSoundLevelSingleValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSoundLevelSingleValue() {
		eUnset(Ifc2x3Package.eINSTANCE.getIfcSoundValue_SoundLevelSingleValue());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSoundLevelSingleValue() {
		return eIsSet(Ifc2x3Package.eINSTANCE.getIfcSoundValue_SoundLevelSingleValue());
	}

} //IfcSoundValueImpl