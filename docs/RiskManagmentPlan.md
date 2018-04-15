# Risk Management Plan
This is the risk managment plan for Team Shotgun Surgery. All members are expected and required to go through and understand the plan
regularly, for 2 reasons:
1. The team needs to read through all the risks and understand what is required in order monitor the possibility and impact of any potential
risks that may jeopardise the entire project. 
2. This risk management plan acts as a mitigation reference for the team whenever an emergency occurs. If the emergency in question is
listed down here as one of the risks in the risk register, refer to the **Mitigation Strategy** section of the risk to decide the
next course of action.

Any member is more than welcome to edit/add any risks that may come across their mind. <br/>
If there are any questions or confusions that needs to be cleared up in this Risk Managment Plan, please do discuss the matter with the entire team on our Facebook group chat.

# Table of Contents
- [Impact Value Scale](#impactScale)
- [Probability Scale](#probabilityScale)
- [Risk Register](#riskRegister)
    1. [Technical Risks](#technicalRisk)
	    1. [Workspace Hardware Failure](#hardwareFailure)
	    2. [Scope Screep](#scopeCreep)
	2. [Operational Risks](#operationalRisks)
	    1. [Incompatible Software Modules](#incompatibleSoftwareModules)
	    2. [Morning After Sydrome](#morningAfterSyndrome)
	3. [External Risks](#externalRisks)
	    1. [The occurence of natural disasters](#naturalDisasters)
	    2. [Loss of a Team Member](#teamMemberLoss)
	    3. [eSolution Pulls Out of The Project](#eSolutions)
	    4. [Occurence of Team Disputes](#teamDisputes)

<a name="impactScale"></a>
# Impact Value Scale
Impact Value | Description
--- | ---
5 | <ul><li> The risk has an extreme impact on the project </li><li> Project may end up not being delivered at all, being delayed by 50% or higher. </li><li> Team may not be able to continue functioning </li><li> Should be avoided at all costs </li></ul>
4 | <ul><li> The risk has a significant impact on the project </li><li> Project may be severely delayed by 25-50% </li><li> Team morale may be severely affected </li><li> Complex and detailed avoidance strategies should be designed for avoidance </li></ul>
3 | <ul><li> The risk has a moderate impact on the project </li><li> Project may be slightly delayed by 5-25% </li><li> Team will be affected, but can be solved easily </li><li> Make plans to avoid if possible </li></ul>
2 | <ul><li> The risk has little impact on the project </li><li> Project can still be delivered on time with a lower than 5% delays. </li><li> Little to no effect on team </li><li> There is no need for complicated avoidance strategies </li></ul>
1 | <ul><li> The risk has no impact on the project </li><li> Project timeline will not be affected at all with 0% delays. </li><li> Team will not be affected at all </li><li> No plans needed to avoid </li></ul>

<a name="probabilityScale"></a>
# Probability Scale
Scale | Probability
--- | ---
5 | <ul><li> Almost definitely to occur </li><li> 85%-100% chance to occur </li></ul>
4 | <ul><li> Very likely to occur </li><li> 65%-85% chance to occur </li></ul> 
3 | <ul><li> Likely to occur </li><li> 45%-65& chance to occur </li></ul> 
2 | <ul><li> Unlikely to occur </li><li> 25%-45% chance to occur </li></ul> 
1 | <ul><li> Very unlikely to occcur </li><li> 5-25% chance to occur </li></ul> 
0 | <ul><li> Almost impossible to occur </li><li> 0%-5% chance to occur </li></ul> 

<a name="riskRegister"></a>
# Risk Register


<a name="technicalRisk"></a>
## Technical Risks


<a name="hardwareFailure"></a>
### Workspace Hardware Failure

Overview | Faulty workspace hardware, such as laptops and mobile phones of team member(s)
------------ | -------------
Impact | Impact Value: 3 <br/> Team member is unable complete their part as their personal workspace device is broken, with a possibility of losing work progress.
Likelihood | 3 
Mitigation Strategy | 1. Use computers in the University's 24 hour computer lab in rainforest walk. <br/> 2. Backup work on a secondary drive or in a cloud drive such as Dropbox/Google Drive.

<a name="scopeCreep"></a>
### Scope Creep

Overview | Team maybe be over ambitious and plan out more than what is the team capable of doing before the next milestone/deadline.
------------ | -------------
Impact | Impact Value: 4 <br/> The client may have high expectations and the team may not deliver all requirements by the deadline. A great delay will be expected and team morale will be severely affected
Likelihood | 4
Mitigation Strategy | 1. Always plan carefully in detail and within means of the team's resources <br/> 2. Prioritise and push less important stories to the next milestone.

<a name="operationalRisks"></a>
## Operational Risks

<a name="incompatibleSoftwareModules"></a>
### Incompatible Software Modules
Overview | There exists incompatible software modules, affecting the relationship between modules/system as a whole
------------ | -------------
Impact | Impact Value: 3 <br/> Project may be slightly delayed
Likelihood | 3
Mitigation Strategy | 1. Ensure that a module is compatible with other modules before applying. <br/> 2. If implemented but incompatible, edit/change the software module and repeat step 1.

<a name="morningAfterSyndrome"></a>
### Morning After Syndrome
Overview | Another teammate has added/edited parts of code that causes one or more systems in the team's software to fail
------------ | -------------
Impact | Impact Value: 3 <br/> Parts of the software will remain faulty till fixed.
Likelihood | 5
Mitigation Strategy | 1. Reduce dependencies between packages. <br/> 2. Team members should understand which packages depend on each other and ensures that their edits do not stir the relationship between systems. <br/> 3. If happened, check Git commit history and find out the person responsible. Discuss with said person and revert software to earlier version/ Edit the code to fix the problem.


<a name="externalRisks"></a>
## External Risks

<a name="naturalDisasters"></a>
### The Occurence of Natural Disasters

Overview | Natural disasters such as Earthquakes or floods may damage resources such as workspace hardware and prevent team members from moving on in the project.
------------ | -------------
Impact | Impact Value: 5 <br/> The project may be called of completely or delayed to a point where the client will lose interest in our software.
Likelihood | 0
Mitigation Strategy | 1. See [Workspace Hardware Failure](#hardwareFailure) <br/> 2. If it does happen, have an urgent meeting (face to face/digital) with the team to discuss the next course of action: To continue/ Pull out

<a name="teamMemberLoss"></a>
### Loss of a Team Member

Overview | Team loses a team member. This can include the passing of the team member, or any other unexpected circumstances where the member is required to be removed from the team.
------------ | -------------
Impact | Impact Value: 5 <br/> The unfinished work that is assigned to that team member will not be completed.
Likelihood | 2
Mitigation Strategy | 1. Do not over assign tasks to any particular team member, avoid single points of failures. <br/> 2. Immediately have a meeting to decide how will the unfinished tasks will be allocated to the remaining team members. <br/> 3. Request from other teams to have a team member temporarily transfer over to replace that team member. 


<a name="eSolutions"></a>
### eSolution pulls out of the project

Overview | As implied in the title, eSolutions may terminate the entire project. This can be caused by many reasons: 1. Incompetence of students, causing a loss in confidence from eSolutions <br/> 2. They feel that they no longer have any need of our software <br/> 3. They have found better options <br/> ...
------------ | -------------
Impact | Impact Value: 5 <br/> The project fails instantly
Likelihood | 0
Mitigation Strategy | 1. Make sure every requirement is set properly in aims to satisfy the stakeholder. <br/> 2. If it does happen, send a student representative from each of the 4 teams to convince eSolutions to let the project go on.

<a name="teamDisputes"></a>
### Occurence of Team Disputes
Overview | Team members may have arguments/disagreements between each other.
------------ | -------------
Impact | Impact Value: 3 <br/> Team morale will be affected, project may be delayed and there will be a drop in quality of the delivered product.
Likelihood | 2
Mitigation Strategy | 1. Each member has the responsbility to consider and respect the opinions/wellbeing of all the members in the group. 2. When a dispute between 2 or more teammates occurs: <br/>1. Have a face to face meeting to resolve the issue when both sides have calmed down and are able to think rationally.<br/>2. Other teammates should try their best to make peace between the two sides.<br/>