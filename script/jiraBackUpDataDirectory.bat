@echo off 
echo ִ��jira����Ŀ¼��������
xcopy "D:\datest\software\jira\jira-home-directory\*.*" D:\datest\backup\jira\dataDirectory /e /y /c  
echo �˳�jira����Ŀ¼�������� 
echo ִ��jiraĿ¼��������
xcopy "D:\datest\software\jira\atlassian-jira-6.0.5\*.*" D:\datest\backup\jira\atlassian-jira-6.0.5 /e /y /c  
echo �˳�jiraĿ¼�������� 
echo . 
exit