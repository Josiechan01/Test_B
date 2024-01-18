SELECT user_code, COUNT(DISTINCT tote_number) AS num_totes_packed
FROM your_table_name
WHERE action_code = 'PACKED'
  AND process_date >= '2024-01-18 10:00:00'
  AND process_date <= '2024-01-18 10:59:59'
GROUP BY user_code;