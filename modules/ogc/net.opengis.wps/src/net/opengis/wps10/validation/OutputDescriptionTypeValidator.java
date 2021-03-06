/**
 *
 * $Id$
 */
package net.opengis.wps10.validation;

import net.opengis.wps10.LiteralOutputType;
import net.opengis.wps10.SupportedCRSsType;
import net.opengis.wps10.SupportedComplexDataType;

/**
 * A sample validator interface for {@link net.opengis.wps10.OutputDescriptionType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OutputDescriptionTypeValidator {
  boolean validate();

  boolean validateComplexOutput(SupportedComplexDataType value);
  boolean validateLiteralOutput(LiteralOutputType value);
  boolean validateBoundingBoxOutput(SupportedCRSsType value);
}
