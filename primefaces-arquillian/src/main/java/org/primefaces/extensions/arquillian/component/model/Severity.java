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
package org.primefaces.extensions.arquillian.component.model;

public enum Severity {

    INFO,
    WARN,
    ERROR,
    FATAL;

    public static Severity toSeverity(String className) {
        if (className.contains("info")) {
            return INFO;
        }

        if (className.contains("warn")) {
            return WARN;
        }

        if (className.contains("error")) {
            return ERROR;
        }

        if (className.contains("fatal")) {
            return FATAL;
        }

        return null;
    }

    public static String toName(Severity severity) {
        switch (severity) {
            case ERROR:
                return "error";
            case FATAL:
                return "fatal";
            case INFO:
                return "info";
            case WARN:
                return "warn";
        }

        return null;
    }
}