/**
 * Copyright (c) 2014 University of Southampton.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * $Id$
 */
package ac.soton.rms.components.impl;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Collection;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eventb.emf.core.impl.EventBNamedImpl;
import ac.soton.rms.components.AbstractVariable;
import ac.soton.rms.components.ComponentsPackage;
import ac.soton.rms.components.FMUComponent;
import ac.soton.rms.components.FMUParameter;
import ac.soton.rms.components.Port;
import ac.soton.rms.components.util.custom.SimStatus;
import ac.soton.rms.components.util.custom.SimulationUtil;
import de.prob.cosimulation.FMU;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FMU Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.rms.components.impl.FMUComponentImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link ac.soton.rms.components.impl.FMUComponentImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link ac.soton.rms.components.impl.FMUComponentImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link ac.soton.rms.components.impl.FMUComponentImpl#getPath <em>Path</em>}</li>
 *   <li>{@link ac.soton.rms.components.impl.FMUComponentImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link ac.soton.rms.components.impl.FMUComponentImpl#getFmu <em>Fmu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FMUComponentImpl extends EventBNamedImpl implements FMUComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2014 University of Southampton.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html";

	/**
	 * The cached value of the '{@link #getInputs() <em>Inputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> inputs;

	/**
	 * The cached value of the '{@link #getOutputs() <em>Outputs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputs()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> outputs;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractVariable> variables;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<FMUParameter> parameters;

	/**
	 * The default value of the '{@link #getFmu() <em>Fmu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmu()
	 * @generated
	 * @ordered
	 */
	protected static final FMU FMU_EDEFAULT = null;

	private static final DecimalFormat DECIMAL_FORMAT = new DecimalFormat("0.##########");

	/**
	 * The cached value of the '{@link #getFmu() <em>Fmu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFmu()
	 * @generated
	 * @ordered
	 */
	protected FMU fmu = FMU_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FMUComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.FMU_COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getInputs() {
		if (inputs == null) {
			inputs = new EObjectContainmentEList.Resolving<Port>(Port.class, this, ComponentsPackage.FMU_COMPONENT__INPUTS);
		}
		return inputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOutputs() {
		if (outputs == null) {
			outputs = new EObjectContainmentEList.Resolving<Port>(Port.class, this, ComponentsPackage.FMU_COMPONENT__OUTPUTS);
		}
		return outputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractVariable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList.Resolving<AbstractVariable>(AbstractVariable.class, this, ComponentsPackage.FMU_COMPONENT__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.FMU_COMPONENT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FMUParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList.Resolving<FMUParameter>(FMUParameter.class, this, ComponentsPackage.FMU_COMPONENT__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FMU getFmu() {
		return fmu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFmu(FMU newFmu) {
		FMU oldFmu = fmu;
		fmu = newFmu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.FMU_COMPONENT__FMU, oldFmu, fmu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IStatus instantiate() {
		assert getPath() != null;
		
		try {
			setFmu(new FMU(getPath()));
		} catch (IOException e) {
			return SimStatus.LOAD_ERROR;
		}
		
		return SimStatus.OK_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IStatus initialise(double tStart, double tStop) {
		FMU fmu = getFmu();
		assert fmu != null;
		
		// initialise parameters that have non-default values
		for (FMUParameter param : getParameters()) {
			if (!param.getStartValue().equals(param.getDefaultValue()))
				SimulationUtil.fmuSet(fmu, param, param.getStartValue());
		}
		
		// initialise FMU
		fmu.initialize(tStart, tStop);
		
		// update internal/output variables
		for (AbstractVariable v : getVariables())
			v.setValue(SimulationUtil.fmuGet(fmu, v));
		for (Port p : getOutputs())
			p.setValue(SimulationUtil.fmuGet(fmu, p));
		
		return SimStatus.OK_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IStatus readInputs() {
		FMU fmu = getFmu();
		assert fmu != null;
		
		for (Port port : getInputs()) {
			Port input = port.getIn();
			
			// skip port if not connected
			if (input == null) {
				continue;
			}
			
			SimulationUtil.fmuSet(fmu, port, input.getValue());
		}
		return SimStatus.OK_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IStatus writeOutputs() {
		FMU fmu = getFmu();
		assert fmu != null;
		
		for (Port port : getOutputs()) {
			port.setValue(SimulationUtil.fmuGet(fmu, port));
		}
		return SimStatus.OK_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IStatus doStep(double time, double step) {
		FMU fmu = getFmu();
		assert fmu != null;
		
		//XXX: time fix
		double rem = Math.IEEEremainder(time, 0.00000001);
		if (rem > 0) {
			time = Double.parseDouble(DECIMAL_FORMAT.format(time));
		}
		
		// simulation step
		fmu.doStep(time, step);
		
		// update variables
		for (AbstractVariable v : getVariables())
			v.setValue(SimulationUtil.fmuGet(fmu, v));
		for (Port p : getOutputs())
			p.setValue(SimulationUtil.fmuGet(fmu, p));
		return SimStatus.OK_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IStatus terminate() {
		//FIXME: termination causes JVM to fail (invalid memory access)
		FMU fmu = getFmu();
		assert fmu != null;
		
		fmu.reset();
		return SimStatus.OK_STATUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.FMU_COMPONENT__INPUTS:
				return ((InternalEList<?>)getInputs()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.FMU_COMPONENT__OUTPUTS:
				return ((InternalEList<?>)getOutputs()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.FMU_COMPONENT__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
			case ComponentsPackage.FMU_COMPONENT__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ComponentsPackage.FMU_COMPONENT__INPUTS:
				return getInputs();
			case ComponentsPackage.FMU_COMPONENT__OUTPUTS:
				return getOutputs();
			case ComponentsPackage.FMU_COMPONENT__VARIABLES:
				return getVariables();
			case ComponentsPackage.FMU_COMPONENT__PATH:
				return getPath();
			case ComponentsPackage.FMU_COMPONENT__PARAMETERS:
				return getParameters();
			case ComponentsPackage.FMU_COMPONENT__FMU:
				return getFmu();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ComponentsPackage.FMU_COMPONENT__INPUTS:
				getInputs().clear();
				getInputs().addAll((Collection<? extends Port>)newValue);
				return;
			case ComponentsPackage.FMU_COMPONENT__OUTPUTS:
				getOutputs().clear();
				getOutputs().addAll((Collection<? extends Port>)newValue);
				return;
			case ComponentsPackage.FMU_COMPONENT__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends AbstractVariable>)newValue);
				return;
			case ComponentsPackage.FMU_COMPONENT__PATH:
				setPath((String)newValue);
				return;
			case ComponentsPackage.FMU_COMPONENT__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends FMUParameter>)newValue);
				return;
			case ComponentsPackage.FMU_COMPONENT__FMU:
				setFmu((FMU)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ComponentsPackage.FMU_COMPONENT__INPUTS:
				getInputs().clear();
				return;
			case ComponentsPackage.FMU_COMPONENT__OUTPUTS:
				getOutputs().clear();
				return;
			case ComponentsPackage.FMU_COMPONENT__VARIABLES:
				getVariables().clear();
				return;
			case ComponentsPackage.FMU_COMPONENT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case ComponentsPackage.FMU_COMPONENT__PARAMETERS:
				getParameters().clear();
				return;
			case ComponentsPackage.FMU_COMPONENT__FMU:
				setFmu(FMU_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ComponentsPackage.FMU_COMPONENT__INPUTS:
				return inputs != null && !inputs.isEmpty();
			case ComponentsPackage.FMU_COMPONENT__OUTPUTS:
				return outputs != null && !outputs.isEmpty();
			case ComponentsPackage.FMU_COMPONENT__VARIABLES:
				return variables != null && !variables.isEmpty();
			case ComponentsPackage.FMU_COMPONENT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case ComponentsPackage.FMU_COMPONENT__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case ComponentsPackage.FMU_COMPONENT__FMU:
				return FMU_EDEFAULT == null ? fmu != null : !FMU_EDEFAULT.equals(fmu);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (path: ");
		result.append(path);
		result.append(", fmu: ");
		result.append(fmu);
		result.append(')');
		return result.toString();
	}

} //FMUComponentImpl