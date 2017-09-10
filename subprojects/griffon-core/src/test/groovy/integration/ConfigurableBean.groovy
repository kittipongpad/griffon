/*
 * Copyright 2008-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package integration

import griffon.core.configuration.Configured

import javax.annotation.Nonnull

class ConfigurableBean {
    private String pstring

    @Configured(value = 'keys.key2', defaultValue = 'true')
    boolean pboolean

    @Configured(value = 'keys.key3', defaultValue = '01/01/2000', format = 'dd/MM/yyyy')
    Date pdate

    @Nonnull
    String getPstring() {
        return pstring
    }

    @Configured('keys.key1')
    void setPstring(String pstring) {
        this.pstring = pstring
    }

    @Configured(value='keys.key4', defaultValue = '*custom*', editor = CustomStringPropertyEditor)
    String customString
}
