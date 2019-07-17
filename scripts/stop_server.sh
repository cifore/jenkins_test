#!/bin/bash
PROCESS=`ps -ef|grep jenkins-0.0.1-SNAPSHOT|grep java | grep -v grep|grep -v PPID|awk '{print $2}'`
if [ -n "$PROCESS" ];then
        echo ${PROCESS}
        kill -9 $PROCESS
        echo "kill process finished"
else
        echo "not find the pid of procedure"
        exit
fi