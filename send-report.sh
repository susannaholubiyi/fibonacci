#!/bin/bash

REPORT_DIR=target/surefire-reports
LOCAL_URL=http://localhost:8080/report
HOSTED_URL=https://yourdomain.com/report

for REPORT_FILE in $REPORT_DIR/TEST-*.xml; do
    if [ -f "$REPORT_FILE" ]; then
        # Send report to localhost
        curl -X POST -H "Content-Type: text/xml" --data-binary @$REPORT_FILE $LOCAL_URL

        # Send report to hosted domain
       # curl -X POST -H "Content-Type: text/xml" --data-binary @$REPORT_FILE $HOSTED_URL
    else
        echo "No report file found at $REPORT_FILE"
    fi
done



#mvn test
#mvn surefire-report:report
