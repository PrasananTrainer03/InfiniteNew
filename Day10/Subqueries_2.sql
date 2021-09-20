-- display all doctor details who is treating patients 

select * from Doctor_master where Doctor_id=ANY
(select doctor_id from Patient_master);

-- Display patient_info who are admitted 

select * from patient_master where pid =ANY
(select pid from room_allocation);

-- display all doctor details who are not treating patients

select * from Doctor_master where Doctor_id<> ALL
(select doctor_id from Patient_master);

-- Display patient_info who are not admitted 

select * from patient_master where pid <> ALL
(select pid from room_allocation)

