/*
 * Copyright (C) 2018-2025 Philip Helger (www.helger.com)
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
package com.helger.phive.oioubl.supplementary.tools;

import java.io.File;
import java.util.Comparator;
import java.util.Map;

import com.helger.collection.commons.CommonsArrayList;
import com.helger.collection.commons.CommonsTreeMap;
import com.helger.collection.commons.ICommonsMap;
import com.helger.io.file.FileSystemRecursiveIterator;
import com.helger.text.compare.ComparatorHelper;

public class MainAssignTestFilesToDocTypes
{
  public static void main (final String [] args)
  {
    final ICommonsMap <String, String> aMap = new CommonsTreeMap <> (ComparatorHelper.getComparatorStringLongestFirst (false));
    aMap.put ("ApplicationResponse", "APPLICATION_RESPONSE");
    aMap.put ("Catalogue", "CATALOGUE");
    aMap.put ("CatalogueDeletion", "CATALOGUE_DELETION");
    aMap.put ("CatalogueItemSpecificationUpdate", "CATALOGUE_ITEM_SPECIFICATION_UPDATE");
    aMap.put ("CataloguePricingUpdate", "CATALOGUE_PRICING_UPDATE");
    aMap.put ("CatalogueRequest", "CATALOGUE_REQUEST");
    aMap.put ("CreditNote", "CREDIT_NOTE");
    aMap.put ("Invoice", "INVOICE");
    aMap.put ("Order", "ORDER");
    aMap.put ("OrderCancellation", "ORDER_CANCELLATION");
    aMap.put ("OrderChange", "ORDER_CHANGE");
    aMap.put ("OrderResponse", "ORDER_RESPONSE");
    aMap.put ("OrderResponseSimple", "ORDER_RESPONSE_SIMPLE");
    aMap.put ("Reminder", "REMINDER");
    aMap.put ("Statement", "STATEMENT");
    if (false)
      aMap.put ("UtilityStatement", "UTILITY_STATEMENT");

    for (final File f : new CommonsArrayList <> (new FileSystemRecursiveIterator (new File ("src/test/resources/external/test-files/2.0.2"))).getSortedInline (Comparator.comparing (File::getName)))
    {
      if (false)
        System.out.println (f.getName ());

      String sBestMatch = null;
      for (final Map.Entry <String, String> e : aMap.entrySet ())
        if (f.getName ().contains (e.getKey ()))
        {
          sBestMatch = e.getValue ();
          break;
        }

      if (sBestMatch == null)
      {
        System.err.println ("  No match found: " + f.getName ());
        continue;
      }

      System.out.println ("aMap.computeIfAbsent (OIOUBLValidation.VID_OIOUBL_" +
                          sBestMatch +
                          ", k -> new CommonsArrayList<> ()).add (new ClassPathResource (sBasePath + \"" +
                          f.getName () +
                          "\"));");
    }
  }
}
