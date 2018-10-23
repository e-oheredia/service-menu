
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Generar Envios')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Masivo')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Individual')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'', N'Guías')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Por procesar')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Subir Resultados')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Creadas')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Control y Mantenimiento')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Asignación de Plazos de Distribución')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Autorizar Envíos')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Custodia')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Masivo')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Individual')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Consultas')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Todos los Documentos')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Mis Documentos')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Documentos Custodiados')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Recepción')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Cargos')
INSERT [dbo].[menu] ([activo], [clase_icono], [nombre]) VALUES (1, N'oi oi-aperture', N'Documentos Devueltos')
SET IDENTITY_INSERT [dbo].[menu] OFF
INSERT [dbo].[jerarquia_menu] ([menu_padre_id], [menu_hijo_id]) VALUES (1, 2)
INSERT [dbo].[jerarquia_menu] ([menu_padre_id], [menu_hijo_id]) VALUES (1, 3)
INSERT [dbo].[jerarquia_menu] ([menu_padre_id], [menu_hijo_id]) VALUES (4, 5)
INSERT [dbo].[jerarquia_menu] ([menu_padre_id], [menu_hijo_id]) VALUES (4, 6)
INSERT [dbo].[jerarquia_menu] ([menu_padre_id], [menu_hijo_id]) VALUES (4, 7)
INSERT [dbo].[jerarquia_menu] ([menu_padre_id], [menu_hijo_id]) VALUES (8, 9)
INSERT [dbo].[jerarquia_menu] ([menu_padre_id], [menu_hijo_id]) VALUES (8, 10)
INSERT [dbo].[jerarquia_menu] ([menu_padre_id], [menu_hijo_id]) VALUES (11, 12)
INSERT [dbo].[jerarquia_menu] ([menu_padre_id], [menu_hijo_id]) VALUES (11, 13)
INSERT [dbo].[jerarquia_menu] ([menu_padre_id], [menu_hijo_id]) VALUES (14, 15)
INSERT [dbo].[jerarquia_menu] ([menu_padre_id], [menu_hijo_id]) VALUES (14, 16)
INSERT [dbo].[jerarquia_menu] ([menu_padre_id], [menu_hijo_id]) VALUES (14, 17)
INSERT [dbo].[jerarquia_menu] ([menu_padre_id], [menu_hijo_id]) VALUES (18, 19)
INSERT [dbo].[jerarquia_menu] ([menu_padre_id], [menu_hijo_id]) VALUES (18, 20)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (2, N'/generar-documentos/masivo', 2)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (3, N'/generar-documentos/individual', 1)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (5, N'/guias-enviadas', 2)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (6, N'/subir-resultados', 3)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (7, N'/guias-creadas', 1)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (9, N'/mantenimiento/permiso-plazo-distribucion', 2)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (10, N'/autorizar-envios', 1)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (12, N'/custodiar-envios-masivos', 2)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (13, N'/custodiar-envios-individuales', 1)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (15, N'/consultar-documentos-utd-bcp', 3)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (16, N'/consultar-documentos-usuario-bcp', 2)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (17, N'/documentos-custodiados', 1)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (19, N'/recepcionar-cargos', 1)
INSERT [dbo].[opcion] ([menu_id], [link], [orden]) VALUES (20, N'/recepcionar-documentos', 2)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (2, 6)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (3, 6)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (5, 6)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (6, 6)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (7, 6)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (9, 6)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (10, 6)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (12, 6)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (13, 6)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (15, 6)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (16, 6)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (17, 6)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (19, 6)
INSERT [dbo].[opcion_permiso] ([opcion_id], [permiso_id]) VALUES (20, 6)




