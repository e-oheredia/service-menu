INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Registrar Campaña')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Selección de Proveedor')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Campañas por Georreferenciar')

INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (1, N'/ingresar-campana', 1)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (2, N'/seleccion-proveedor', 2)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (3, N'/visualizar-pedidos-georeferencia', 3)

INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (1, 1)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (2, 1)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (3, 1)






