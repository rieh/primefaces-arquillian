/**
 * Copyright 2011-2019 PrimeFaces Extensions
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.extensions.arquillian.component.base;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.graphene.GrapheneElement;
import org.jboss.arquillian.graphene.fragment.Root;
import org.openqa.selenium.WebDriver;
import org.primefaces.extensions.arquillian.PrimeGraphene;

public abstract class AbstractComponent implements GrapheneElement {

    @Drone
    protected WebDriver driver;

    @Root
    protected GrapheneElement root;

    public GrapheneElement getRoot() {
        return root;
    }

    public String getId() {
        return root.getAttribute("id");
    }

    protected String getWidgetByIdScript() {
        return PrimeGraphene.getWidgetByIdScript(getId());
    }
}
