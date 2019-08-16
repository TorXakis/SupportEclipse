# The TorXakis Eclipse Plug-In

The TorXakis Eclipse Plug-In provides a specialized TorXakisDsl editor within eclipse which helps you editing TorXakis files(.txs). This specialized editor has syntax highlighting and will show errors when something is wrong in the syntax of the model.

The TorXakis DSL is developed using http://www.cs.kun.nl/J.Hooman/DSL/

##	Install the Plug-in[¶](#Install-the-Plug-in)

To install the TorXakis Eclipse Plug-in for the first time, carry out the following steps:

1.	From the Eclipse “Help” menu select “Install New Software…”. The “Install” dialog appears.
2.	Click the “Add…” button. The “Add Repository” dialog appears.
3.	In the “Name” field enter “TorXakis Eclipse Plug-in”.
4.	In the “Location”  field enter:<br/>
      &nbsp;&nbsp;&nbsp;&nbsp;`jar:https://github.com/TorXakis/SupportEclipse/releases/latest/download/update-site.zip!/`
5.	Click “Open”.
6.	Click “OK”.
7.	Uncheck “Group items by category” checkbox in lower section.
8.	Click the “TorXakisDsl Feature” checkbox and click  “Next” twice.
9.	Accept the license agreement and click “Finish”. Wait while plug-in is being installed.
10.	A “Security Warning” pop-up might appear. Click “OK” to continue installing the plug-in. 
11.	When the installation has finished a pop-up appears that asks to restart Eclipse. A restart is required to use the plug-in so click “Yes”.

Now you are done and can enjoy improved editing of TorXakis files(.txs) within eclipse.

## Check for updates[¶](#Check-for-updates)

Updates of the TorXakis Eclipse Plug-in are distributed via the plug-in site. The standard Eclipse “Check for updates” mechanism is used here:

1.	From the Eclipse menu bar select “Help” => “Check for Updates”. If there are updates a dialog will pop-up.
2.	Select the update and click “Next” twice.
3.	Accept license agreement and click “Finish”. The plug-in will now be updated.
4.	A “Security Warning” pop-up might appear. Click “OK” to continue installing the plug-in. 
5.	When the installation has finished a pop-up appears that asks to restart Eclipse. A restart is required to use the plug-in so click “Yes”.

##	Testing the Plug-In[¶](#Testing-the-Plug-In)

To test the plug-in there is a list of TorXakis files to check the editor works alright in all of them.
To retreive these TorXakis files in a special "test" project do the following:

1.	Download the "test" project from github into a local folder test/ by running the following command  in a shell:<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;svn export https://github.com/TorXakis/SupportEclipse.git/trunk/test   
2.	From the Eclipse “File” menu select “Import…”. The “Import” dialog appears.
3.	Select “General -> Existing Projects into Workspace” and click “Next”.
4.	Click “Browse…”, the “Browse For Folder” dialog opens.
5.	Select the folder test and  click “Finish”.
6.	The “test” project is now visible in the “Project Explorer”. Open the test folder and select all “.txs” files in it. 
7.	Right-click one of the selected files and select open. This will open editors for all .txs files.
8.	Now check that there are no errors in the file. If a red rectangle appears in front of the file name, there is an error in the plug-in. Please report an issue of this problem in this github project.

