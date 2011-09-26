/**
 * Copyright (C) 2011  BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc2x3;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ifc Shape Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3.IfcShapeModel#getOfShapeAspect <em>Of Shape Aspect</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcShapeModel()
 * @model
 * @generated
 */
public interface IfcShapeModel extends IfcRepresentation {
	/**
	 * Returns the value of the '<em><b>Of Shape Aspect</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.models.ifc2x3.IfcShapeAspect}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.models.ifc2x3.IfcShapeAspect#getShapeRepresentations <em>Shape Representations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Of Shape Aspect</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Of Shape Aspect</em>' reference list.
	 * @see org.bimserver.models.ifc2x3.Ifc2x3Package#getIfcShapeModel_OfShapeAspect()
	 * @see org.bimserver.models.ifc2x3.IfcShapeAspect#getShapeRepresentations
	 * @model opposite="ShapeRepresentations" upper="2"
	 * @generated
	 */
	EList<IfcShapeAspect> getOfShapeAspect();

} // IfcShapeModel