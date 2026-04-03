/*
 * Copyright (C) 2025-2026 Philip Helger (www.helger.com)
 * philip[at]helger[dot]com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.helger.phive.iras;

import com.helger.annotation.concurrent.Immutable;
import com.helger.diver.api.coord.DVRCoordinate;
import com.helger.phive.api.executorset.IValidationExecutorSetRegistry;
import com.helger.phive.rules.api.PhiveRulesHelper;
import com.helger.phive.xml.source.IValidationSourceXML;
import org.jspecify.annotations.NonNull;

/**
 * Inland Revenue Authority of Singapore (IRAS). It is based on SG Peppol BIS Billing 3.0-Format (PINT SG)
 * validation artefacts.
 *
 * @author Philip Helger
 */
@Immutable
public final class IRASValidation
{
  public static final String GROUP_ID = "sg.iras";

  public static final DVRCoordinate IRAS_INVOICE_1_0_0 = PhiveRulesHelper.createCoordinate (GROUP_ID,
          "billing",
          "1.0.0");

    public static void initIRAS(@NonNull final IValidationExecutorSetRegistry<IValidationSourceXML> aRegistry)
    {
      //todo
    }
}
