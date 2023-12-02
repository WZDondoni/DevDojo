USE AdventureWorks2019
    GO

    --GETDATE() //retorna data e hora local.
    SELECT TRY_CAST(GETDATE() AS TIME) AS [TIME], /* segrega o GETDATE e mostra somente a hora */
           TRY_CAST(GETDATE() AS DATE) AS [DATE], /* segrega o GETDATE  e mostra apenas a data*/
           GETDATE() AS [GETDATE()], /* traz a data e hora, e o comando  mais utilizado*/
           CURRENT_TIMESTAMP AS [CURRENT_TIMESTAMP], /*traz mesma coisa do GETDATE  */
           SYSDATETIME() AS [SYSDATETIME()], /* semelhante ao GETDATE, mas com mais detalhamento do tempo, frações de microsegundo*/
           GETUTCDATE() AS [GETUTCDATE()], /* traz o horario UTC (mudial) */
           SYSUTCDATETIME() AS [SYSUTCDATETIME()], /* horario UTC com mais detalhamento*/
           SYSDATETIMEOFFSET() AS [SYSDATETIMEOFFSET()], /* além de ter fração de segundos, traz o fuso*/
           CURRENT_TIMEZONE() AS [CURRENT_TIMEZONE()] /* não oficial, mas funciona no Azzure, traz o fuso, funciona no SQLServer 2019 */
