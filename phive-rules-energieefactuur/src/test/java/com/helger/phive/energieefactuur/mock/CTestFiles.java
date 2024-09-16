/*
 * Copyright (C) 2017-2024 Philip Helger (www.helger.com)
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
package com.helger.phive.energieefactuur.mock;

import static org.junit.Assert.assertTrue;

import javax.annotation.Nonnull;
import javax.annotation.concurrent.Immutable;

import com.helger.commons.ValueEnforcer;
import com.helger.commons.annotation.ReturnsMutableCopy;
import com.helger.commons.collection.impl.CommonsArrayList;
import com.helger.commons.collection.impl.CommonsHashSet;
import com.helger.commons.collection.impl.ICommonsList;
import com.helger.commons.io.resource.ClassPathResource;
import com.helger.commons.io.resource.IReadableResource;
import com.helger.diver.api.coord.DVRCoordinate;
import com.helger.phive.api.executorset.ValidationExecutorSetRegistry;
import com.helger.phive.api.mock.TestFile;
import com.helger.phive.energieefactuur.EnergieEFactuurValidation;
import com.helger.phive.simplerinvoicing.SimplerInvoicingValidation;
import com.helger.phive.xml.source.IValidationSourceXML;

@Immutable
public final class CTestFiles
{
  public static final ValidationExecutorSetRegistry <IValidationSourceXML> VES_REGISTRY = new ValidationExecutorSetRegistry <> ();
  static
  {
    SimplerInvoicingValidation.initSimplerInvoicing (VES_REGISTRY);
    EnergieEFactuurValidation.initEnergieEFactuur (VES_REGISTRY);
  }

  private CTestFiles ()
  {}

  @Nonnull
  @ReturnsMutableCopy
  public static ICommonsList <TestFile> getAllTestFiles ()
  {
    final ICommonsList <TestFile> ret = new CommonsArrayList <> ();
    for (final DVRCoordinate aVESID : new DVRCoordinate [] { EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_1_0_0,
                                                             EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_1_0_1,
                                                             EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_2_0_0,
                                                             EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_3_0_0,
                                                             EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_3_1_0 })
    {
      for (final IReadableResource aRes : getAllMatchingTestFiles (aVESID))
      {
        assertTrue ("Not existing test file: " + aRes.getPath (), aRes.exists ());
        ret.add (TestFile.createGoodCase (aRes, aVESID));
      }
      ret.addAll (getAllBadTestFiles (aVESID));
    }

    return ret;
  }

  @Nonnull
  @ReturnsMutableCopy
  public static ICommonsList <? extends IReadableResource> getAllMatchingTestFiles (@Nonnull final DVRCoordinate aVESID)
  {
    ValueEnforcer.notNull (aVESID, "VESID");

    final String sPrefix = "/external/test-files/";

    final ICommonsList <IReadableResource> ret = new CommonsArrayList <> ();
    if (aVESID.equals (EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_1_0_0))
    {
      ret.add (new ClassPathResource (sPrefix +
                                      "1.0.0/good/20151117_SEeF - Voorbeeldfactuur 001 - Energie levering.xml"));
    }
    else
      if (aVESID.equals (EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_1_0_1))
      {
        ret.add (new ClassPathResource (sPrefix + "1.0.1/good/20160704_SEeF - Voorbeeldfactuur 001 - levering.xml"));
        ret.add (new ClassPathResource (sPrefix + "1.0.1/good/20160704_SEeF - Voorbeeldfactuur 002 - netbeheer.xml"));
        ret.add (new ClassPathResource (sPrefix +
                                        "1.0.1/good/20160704_SEeF - Voorbeeldfactuur 004 - netbeheer credit.xml"));
        ret.add (new ClassPathResource (sPrefix +
                                        "1.0.1/good/20160704_SEeF - Voorbeeldfactuur 005 - meetdiensten.xml"));
        ret.add (new ClassPathResource (sPrefix + "1.0.1/good/20161208_SEeF - Voorbeeldfactuur 003 - netbeheer.xml"));
      }
      else
        if (aVESID.equals (EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_2_0_0))
        {
          ret.add (new ClassPathResource (sPrefix + "2.0.0/good/20170713_SEeF - Voorbeeldfactuur 001 - levering.xml"));
          ret.add (new ClassPathResource (sPrefix + "2.0.0/good/20170713_SEeF - Voorbeeldfactuur 002 - netbeheer.xml"));
          ret.add (new ClassPathResource (sPrefix + "2.0.0/good/20170713_SEeF - Voorbeeldfactuur 003 - netbeheer.xml"));
          ret.add (new ClassPathResource (sPrefix +
                                          "2.0.0/good/20170713_SEeF - Voorbeeldfactuur 004 - netbeheer credit.xml"));
          ret.add (new ClassPathResource (sPrefix +
                                          "2.0.0/good/20170713_SEeF - Voorbeeldfactuur 005 - meetdiensten.xml"));
        }
        else
          if (aVESID.equals (EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_3_0_0))
          {
            ret.add (new ClassPathResource (sPrefix +
                                            "3.0.0/good/20190326_SEeF 3.0  - Voorbeeldfactuur 001 - levering.xml"));
          }
          else
            if (aVESID.equals (EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_3_1_0))
            {
              ret.add (new ClassPathResource (sPrefix +
                                              "3.1.0/good/20220822_SEeF 3.1  - Voorbeeldfactuur 001 - levering.xml"));
            }
            else
              throw new IllegalArgumentException ("Invalid VESID: " + aVESID);
    return ret;
  }

  @Nonnull
  @ReturnsMutableCopy
  public static ICommonsList <TestFile> getAllBadTestFiles (@Nonnull final DVRCoordinate aVESID)
  {
    ValueEnforcer.notNull (aVESID, "VESID");

    final String sPrefix = "/external/test-files/";

    final ICommonsList <TestFile> ret = new CommonsArrayList <> ();
    if (aVESID.equals (EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_1_0_0))
    {
      // TODO
    }
    else
      if (aVESID.equals (EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_1_0_1))
      {
        // TODO
      }
      else
        if (aVESID.equals (EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_2_0_0))
        {
          ret.add (new TestFile (new ClassPathResource (sPrefix + "2.0.0/bad/bad-meternumber-twice.xml"),
                                 aVESID,
                                 new CommonsHashSet <> ("")));
          ret.add (new TestFile (new ClassPathResource (sPrefix + "2.0.0/bad/bad-no-extension.xml"),
                                 aVESID,
                                 new CommonsHashSet <> ("")));
          ret.add (new TestFile (new ClassPathResource (sPrefix + "2.0.0/bad/bad-two-extensions.xml"),
                                 aVESID,
                                 new CommonsHashSet <> ("")));
        }
        else
          if (aVESID.equals (EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_3_0_0))
          {
            // TODO
          }
          else
            if (aVESID.equals (EnergieEFactuurValidation.VID_ENERGIE_EFACTUUR_3_1_0))
            {
              // TODO
            }
            else
              throw new IllegalArgumentException ("Invalid VESID: " + aVESID);
    return ret;
  }
}
