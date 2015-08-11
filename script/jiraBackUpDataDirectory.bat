@echo off 
echo 执行jira数据目录备份任务
xcopy "D:\datest\software\jira\jira-home-directory\*.*" D:\datest\backup\jira\dataDirectory /e /y /c  
echo 退出jira数据目录备份任务 
echo 执行jira目录备份任务
xcopy "D:\datest\software\jira\atlassian-jira-6.0.5\*.*" D:\datest\backup\jira\atlassian-jira-6.0.5 /e /y /c  
echo 退出jira目录备份任务 
echo . 
exit