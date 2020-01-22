package com.example.retrofittest;

import java.util.ArrayList;
import java.util.List;

public class Post {

    private String elementName;
    private String description;
    private TimeBean[] time;

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TimeBean[] getTime() {
        return time;
    }

    public void setTime(TimeBean[] time) {
        this.time = time;
    }

    public static class TimeBean {
        /**
         * startTime : 2020-01-22T12:00:00+08:00
         * endTime : 2020-01-22T18:00:00+08:00
         * elementValue : {"value":"24","measures":"攝氏度"}
         */

        private String startTime;
        private String endTime;
        private ElementValueBean elementValue;

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getEndTime() {
            return endTime;
        }

        public void setEndTime(String endTime) {
            this.endTime = endTime;
        }

        public ElementValueBean getElementValue() {
            return elementValue;
        }

        public void setElementValue(ElementValueBean elementValue) {
            this.elementValue = elementValue;
        }

        public static class ElementValueBean {
            /**
             * value : 24
             * measures : 攝氏度
             */

            private String value;
            private String measures;

            public String getValue() {
                return value;
            }

            public void setValue(String value) {
                this.value = value;
            }

            public String getMeasures() {
                return measures;
            }

            public void setMeasures(String measures) {
                this.measures = measures;
            }
        }
    }
}
