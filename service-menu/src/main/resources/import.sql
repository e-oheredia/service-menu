INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Registro de Campaña')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Registrar de Campaña')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Selección de Proveedor')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Seleccionar Proveedor')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Georreferenciación')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Campañas por Georreferenciar')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Confirmar Georreferenciación')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Cotización y Conformidad')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Campañas por Recotizar')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Confirmar Cotización')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Verificar Conformidad')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Gestión de Impresión')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Gestionar Impresión')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Subir Muestra')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Imprimir Campaña')

INSERT INTO jerarquia_menu(menu_padre_id, menu_hijo_id) values (1, 2)
INSERT INTO jerarquia_menu(menu_padre_id, menu_hijo_id) values (3, 4)
INSERT INTO jerarquia_menu(menu_padre_id, menu_hijo_id) values (5, 6)
INSERT INTO jerarquia_menu(menu_padre_id, menu_hijo_id) values (5, 7)
INSERT INTO jerarquia_menu(menu_padre_id, menu_hijo_id) values (8, 9)
INSERT INTO jerarquia_menu(menu_padre_id, menu_hijo_id) values (8, 10)
INSERT INTO jerarquia_menu(menu_padre_id, menu_hijo_id) values (8, 11)
INSERT INTO jerarquia_menu(menu_padre_id, menu_hijo_id) values (12, 13)
INSERT INTO jerarquia_menu(menu_padre_id, menu_hijo_id) values (12, 14)
INSERT INTO jerarquia_menu(menu_padre_id, menu_hijo_id) values (12, 15)

INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (2, N'/ingresar-campana', 1)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (4, N'/seleccion-proveedor', 2)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (6, N'/visualizar-pedidos-georeferencia', 3)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (7, N'/confirmar-geo', 4)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (9, N'/recotizacion-campana', 5)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (10, N'/confirmacion-cotizacion', 6)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (11, N'/verificar-conformidad', 7)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (13, N'/solicitud-muestra', 8)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (14, N'/subir-muestra', 9)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (15, N'/impresion-campana', 10)

INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (2, 1)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (4, 1)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (6, 1)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (7, 1)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (9, 1)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (10, 1)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (11, 1)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (13, 1)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (14, 1)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (15, 1)

-- Proveedor
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (6, 2)






