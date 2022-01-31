# Leapwork Integration
This is Leapwork plugin for Jenkins (version 2.277.1 or later)

# More Details
Leapwork is a mighty automation testing system and now it can be used for running [smoke, functional, acceptance] tests, generating reports and a lot more in Jenkins. You can easily configure integration directly in Jenkins enjoying UI friendly configuration page with easy connection and test suites selection.

# Features:
 - Setup and test Leapwork connection in few clicks
 - Run automated tests in your Jenkins build tasks
 - Automatically receive test results
 - Build status based tests results
 - Generate a xml report file in JUnit format
 - Write tests trace to build output log
 - Smart UI
 
# Installing
- Use maven 
- Command: mvn package 
- Or simply install Leapwork.hpi file from the "Releases" section: Manage Jenkins -> Manage Plugins -> Advanced -> Upload Plugin -> Choose that hpi-file -> Press Upload

# Instruction
1. Add Build "Leapwork" to your job from drop down.
2. Enter your Leapwork controller hostname or IP-address something like "win10-agent20" or "localhost".
3. Enter your Leapwork controller API port, by default it is 9001.
4. Enter JUnit report file name. This file will be created at your job's working directory. If there is an xml file with the same name, it will be overwritten. By default it is "report.xml".
5. Enter time delay in seconds. When schedule is run, plugin will wait this time before trying to get schedule state. If schedule is still running, plugin will wait this time again. By default this value is 5 seconds.
6. Select how plugin should set "Done" status value: to Success or Failed.
7. Press button "Select Schedules" to get a list of all available schedules. Select schedules you want to run.
8. If your workspace folder path is not default (JENKINS_HOME\workspace),enter your full path here like {Your path to workspace folder}\workspace. Otherwise DO NOT enter anything!
9. Add Post-Build "Publish JUnit test result report" to your job. Enter JUnit report file name. It MUST be the same you've entered before!
10. Run your job and get results. Enjoy!

# Pipeline
This is an example script for pipeline:
 ```
steps{
	step([$class: 'LeapworkJenkinsBridgeBuilder',
	leapworkAccessKey: 'qwertyui',
	leapworkDelay: '5',
	leapworkDoneStatusAs: 'Success',
	leapworkHostname: 'localhost',
	leapworkPort: '9001',
	leapworkReport: 'report.xml',
	leapworkSchIds: '6a5f047b-b75e-4f07-8eb7-8ab754554bea',
	leapworkSchNames: 'Runschedule',
	leapworkScheduleVariables: 'var1:value',
	leapworkWritePassedFlowKeyFrames: false]
	)
}
```

# Troubleshooting
- If you catch an error "No such run [runId]!" after schedule starting, increase time delay parameter in "advanced".

# Screenshots
