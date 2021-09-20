select PM.PID,PM.Name,DM.Doctor_ID,DM.Doctor_name,RA.Room_NO,RA.admission_date,
RM.ROOM_TYPe
from Doctor_Master DM INNER JOIN
Patient_Master PM ON Dm.Doctor_ID=Pm.Doctor_ID
INNER JOIN room_allocation RA ON 
PM.PId=RA.PID
INNER JOIN room_master RM ON
RA.room_no=RM.room_no;

select PM.PID,PM.Name,DM.Doctor_ID,DM.Doctor_name,RA.Room_NO,RA.admission_date,
RM.ROOM_TYPe
from Doctor_Master DM LEFT JOIN
Patient_Master PM ON Dm.Doctor_ID=Pm.Doctor_ID
LEFT JOIN room_allocation RA ON 
PM.PId=RA.PID
LEFT JOIN room_master RM ON
RA.room_no=RM.room_no;

