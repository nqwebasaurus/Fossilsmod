package fossils.fossils.client.blockentity.model.henodus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class HenodusFossilModel extends SkullModelBase {
	private final ModelPart henodus;
	private final ModelPart shell;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;
	private final ModelPart backleftleg;
	private final ModelPart frontleftleg3;
	private final ModelPart backrightleg;
	private final ModelPart frontrightleg3;
	private final ModelPart leftShell;
	private final ModelPart rightShell;
	private final ModelPart leftShell2;
	private final ModelPart rightShell2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public HenodusFossilModel(ModelPart root) {
		this.henodus = root.getChild("henodus");
		this.shell = this.henodus.getChild("shell");
		this.neck2 = this.shell.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.frontleftleg = this.shell.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontrightleg = this.shell.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
		this.backleftleg = this.shell.getChild("backleftleg");
		this.frontleftleg3 = this.backleftleg.getChild("frontleftleg3");
		this.backrightleg = this.shell.getChild("backrightleg");
		this.frontrightleg3 = this.backrightleg.getChild("frontrightleg3");
		this.leftShell = this.shell.getChild("leftShell");
		this.rightShell = this.shell.getChild("rightShell");
		this.leftShell2 = this.shell.getChild("leftShell2");
		this.rightShell2 = this.shell.getChild("rightShell2");
		this.tail = this.shell.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition henodus = partdefinition.addOrReplaceChild("henodus", CubeListBuilder.create(), PartPose.offset(-0.5F, 23.0F, 0.0F));

		PartDefinition shell = henodus.addOrReplaceChild("shell", CubeListBuilder.create().texOffs(43, 0).addBox(-0.5F, 0.0F, -5.0F, 2.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(0, 57).addBox(0.0F, -1.5F, -5.0F, 1.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(43, 15).addBox(-0.5F, -2.0F, -5.4F, 2.0F, 1.0F, 13.0F, new CubeDeformation(0.0F))
				.texOffs(87, 67).addBox(-0.5F, -0.3F, -5.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.1638F, -0.9629F, 0.2143F, -0.2159F, -0.0001F, 0.1686F));

		PartDefinition cube_r1 = shell.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(87, 4).mirror().addBox(-3.0F, -0.6F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.3F, -5.9F, 0.0F, 0.0F, 0.2182F));

		PartDefinition cube_r2 = shell.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(87, 4).addBox(0.0F, -0.6F, 0.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5F, 0.3F, -5.9F, 0.0F, 0.0F, -0.2182F));

		PartDefinition neck2 = shell.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0251F, -5.0393F, 0.0437F, -0.0436F, -0.0019F));

		PartDefinition cube_r3 = neck2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(65, 99).mirror().addBox(-1.4F, -0.6F, -2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(65, 99).addBox(-0.6F, -0.6F, -2.0F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(85, 88).addBox(-1.0F, -1.1F, -2.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(1.0F, 0.6F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.1544F, -1.9184F, -0.2192F, -0.218F, 0.0097F));

		PartDefinition cube_r4 = neck.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(90, 25).addBox(0.0F, -1.1F, -4.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(-0.5F, 0.7644F, 1.9827F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.011F, -0.5037F, -0.2084F, -0.1281F, 0.027F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(87, 13).addBox(-1.5F, -0.75F, -0.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, -0.5276F, -1.2958F, 0.7418F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(90, 33).addBox(-1.1F, -0.2434F, -0.6251F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.1F, -1.0213F, -1.4644F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(18, 87).addBox(-1.5F, -0.175F, -0.725F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.0F, -0.9206F, -1.9491F, 0.1658F, 0.0F, 0.0F));

		PartDefinition cube_r8 = head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(87, 7).addBox(-1.5F, -0.8604F, -1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)), PartPose.offsetAndRotation(0.0F, -0.1642F, -2.2281F, 0.096F, 0.0F, 0.0F));

		PartDefinition cube_r9 = head.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(73, 93).addBox(-0.525F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.0125F, 1.0216F, -4.9492F, 1.3132F, 0.0359F, 0.09F));

		PartDefinition cube_r10 = head.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(87, 16).addBox(-1.5F, -0.675F, -0.55F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.0F, 1.3404F, -4.674F, 0.1047F, 0.0F, 0.0F));

		PartDefinition cube_r11 = head.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(89, 10).mirror().addBox(-1.2F, -0.4F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F)).mirror(false)
				.texOffs(89, 10).addBox(1.2F, -0.4F, -0.45F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.303F))
				.texOffs(87, 10).addBox(-1.0F, -0.4F, -0.45F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.5F, 1.0347F, -5.0191F, -0.5061F, 0.0F, 0.0F));

		PartDefinition cube_r12 = head.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(30, 91).addBox(-1.5F, 0.075F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F))
				.texOffs(79, 92).addBox(-1.5F, -0.325F, -0.3F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.4633F, -5.2291F, 0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r13 = head.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(91, 70).addBox(-1.5F, -0.425F, -0.725F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F))
				.texOffs(96, 12).addBox(-1.0F, -0.425F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.5F, 0.3121F, -4.8195F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r14 = head.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(15, 94).addBox(-1.0F, -0.15F, -1.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.148F))
				.texOffs(10, 94).addBox(-1.0F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.6717F, -4.0413F, 0.5847F, 0.0F, 0.0F));

		PartDefinition cube_r15 = head.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(5, 94).addBox(-1.5F, -0.15F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(1.0F, -0.8052F, -3.3542F, 0.192F, 0.0F, 0.0F));

		PartDefinition cube_r16 = head.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(17, 72).addBox(-1.5F, -0.85F, -0.225F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1101F, -3.2682F, -0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r17 = head.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(20, 97).addBox(-0.5F, -0.475F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.583F, -4.7552F, 1.309F, 0.0F, 0.0F));

		PartDefinition cube_r18 = head.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(15, 97).addBox(-1.1639F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.6F, 0.3535F, -4.4276F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r19 = head.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(97, 27).mirror().addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.4277F, 0.215F, -4.1615F, 0.4996F, -0.27F, -0.1446F));

		PartDefinition cube_r20 = head.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(55, 96).mirror().addBox(-0.45F, -0.85F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)).mirror(false), PartPose.offsetAndRotation(-0.7277F, 0.1909F, -3.267F, 0.4369F, -0.4407F, -0.1966F));

		PartDefinition cube_r21 = head.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(97, 27).addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.3F, 0.215F, -4.1615F, 0.4996F, 0.27F, 0.1446F));

		PartDefinition cube_r22 = head.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(25, 97).addBox(-1.1639F, -0.35F, -0.85F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6F, -0.0796F, -3.9203F, 0.48F, 0.0F, 0.0F));

		PartDefinition cube_r23 = head.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(55, 96).addBox(-0.55F, -0.85F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.155F)), PartPose.offsetAndRotation(0.6F, 0.1909F, -3.267F, 0.4369F, 0.4407F, 0.1966F));

		PartDefinition cube_r24 = head.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(96, 15).mirror().addBox(0.0F, -0.85F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.158F)).mirror(false)
				.texOffs(96, 15).addBox(0.3277F, -0.85F, -0.65F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.7277F, 0.1909F, -3.267F, 0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r25 = head.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(51, 93).addBox(-1.5F, 0.35F, -0.35F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, 0.0609F, -0.7275F, -2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r26 = head.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(44, 93).addBox(-1.5F, -0.15F, -0.85F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(0.5F, 0.0609F, -0.7275F, -1.4835F, 0.0F, 0.0F));

		PartDefinition cube_r27 = head.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(92, 88).addBox(-1.5F, -0.15F, -0.75F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.146F)), PartPose.offsetAndRotation(0.5F, 0.4261F, -1.2036F, -2.4871F, 0.0F, 0.0F));

		PartDefinition cube_r28 = head.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(86, 92).addBox(-0.5F, -0.6F, -0.45F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)), PartPose.offsetAndRotation(-0.5F, 0.5261F, -1.6536F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r29 = head.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(91, 39).mirror().addBox(-1.0F, -0.85F, 0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.159F)).mirror(false)
				.texOffs(91, 36).mirror().addBox(-1.0F, -0.85F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.156F)).mirror(false)
				.texOffs(91, 39).addBox(-0.6723F, -0.85F, 0.05F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(91, 36).addBox(-0.6723F, -0.85F, -0.15F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)), PartPose.offsetAndRotation(-0.2277F, 0.1125F, -2.3704F, -0.9599F, 0.0F, 0.0F));

		PartDefinition cube_r30 = head.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(67, 85).mirror().addBox(-1.0F, -0.05F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.159F)).mirror(false)
				.texOffs(0, 91).addBox(-0.7723F, -0.05F, -1.6F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(67, 85).addBox(-0.6723F, -0.05F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 85).addBox(-0.7723F, -0.35F, -1.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.2277F, -0.7237F, -1.9919F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r31 = head.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(5, 97).mirror().addBox(-0.5F, -0.525F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)).mirror(false)
				.texOffs(5, 97).addBox(1.0277F, -0.525F, -0.775F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.298F)), PartPose.offsetAndRotation(-0.8277F, 0.1893F, -2.2322F, -0.3927F, 0.0F, 0.0F));

		PartDefinition cube_r32 = head.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 97).mirror().addBox(-1.1F, -0.55F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false)
				.texOffs(0, 97).addBox(0.4277F, -0.55F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(-0.2277F, 0.1125F, -2.3704F, -0.829F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(90, 29).addBox(1.075F, -0.25F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.245F))
				.texOffs(90, 29).mirror().addBox(-1.075F, -0.25F, -0.75F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 1.1044F, -1.4251F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r33 = jaw.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(93, 91).mirror().addBox(-0.275F, -0.6725F, -0.4146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8181F, -0.4726F, 0.7854F, -0.0524F, 0.0F));

		PartDefinition cube_r34 = jaw.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(94, 79).mirror().addBox(-0.5F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(94, 79).addBox(1.65F, -0.75F, -0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.575F, 0.9954F, -0.1144F, 1.0908F, 0.0F, 0.0F));

		PartDefinition cube_r35 = jaw.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(93, 97).mirror().addBox(-0.5F, -0.8F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(93, 97).addBox(1.65F, -0.8F, -0.325F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.575F, 0.695F, 0.3523F, 2.0071F, 0.0F, 0.0F));

		PartDefinition cube_r36 = jaw.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(94, 76).mirror().addBox(-0.5F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(94, 76).addBox(1.65F, -0.5F, -0.6F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.575F, 0.6107F, 0.4061F, 1.0036F, 0.0F, 0.0F));

		PartDefinition cube_r37 = jaw.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(55, 99).mirror().addBox(-0.5F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(55, 99).addBox(1.65F, -0.75F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.575F, 0.5F, 1.0F, 0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r38 = jaw.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(43, 87).mirror().addBox(-0.275F, 1.7931F, -1.0501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8181F, -0.4726F, -1.7541F, -0.0524F, 0.0F));

		PartDefinition cube_r39 = jaw.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(98, 94).mirror().addBox(-0.275F, 1.2976F, 0.6838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(85, 98).mirror().addBox(-0.275F, 1.4976F, 0.6838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(94, 85).mirror().addBox(-0.275F, 1.4976F, 0.1838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8181F, -0.4726F, -2.6267F, -0.0524F, 0.0F));

		PartDefinition cube_r40 = jaw.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(98, 48).mirror().addBox(-0.275F, 1.1037F, 0.593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(94, 82).mirror().addBox(-0.275F, 1.1037F, 0.293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.243F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8181F, -0.4726F, -3.0631F, -0.0524F, 0.0F));

		PartDefinition cube_r41 = jaw.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(60, 96).mirror().addBox(-0.275F, 1.2078F, -0.7027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8181F, -0.4726F, -2.714F, -0.0524F, 0.0F));

		PartDefinition cube_r42 = jaw.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(96, 3).mirror().addBox(-0.275F, 1.023F, -0.9601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.258F)).mirror(false)
				.texOffs(96, 0).mirror().addBox(-0.275F, 0.548F, -0.9601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8181F, -0.4726F, -2.5744F, -0.0524F, 0.0F));

		PartDefinition cube_r43 = jaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(58, 93).mirror().addBox(-0.275F, 1.5848F, -0.8343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(63, 93).mirror().addBox(-0.275F, 2.0848F, -0.3343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(79, 89).mirror().addBox(-0.275F, 1.5848F, -0.3343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8181F, -0.4726F, -1.7628F, -0.0524F, 0.0F));

		PartDefinition cube_r44 = jaw.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(27, 87).mirror().addBox(-0.525F, -0.6F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false)
				.texOffs(89, 22).addBox(-0.725F, -0.275F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.308F))
				.texOffs(89, 22).mirror().addBox(1.675F, -0.275F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.308F)).mirror(false)
				.texOffs(87, 22).mirror().addBox(-0.525F, -0.275F, -0.7F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.475F, 0.4344F, -3.5166F, -2.4173F, 0.0F, 0.0F));

		PartDefinition cube_r45 = jaw.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(68, 93).mirror().addBox(-0.275F, 1.4903F, -2.0926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8181F, -0.4726F, -1.1519F, -0.0524F, 0.0F));

		PartDefinition cube_r46 = jaw.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(87, 63).mirror().addBox(-0.275F, 1.1261F, -1.61F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.245F)).mirror(false)
				.texOffs(65, 89).mirror().addBox(0.025F, 0.2319F, -1.6413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(58, 89).mirror().addBox(-0.275F, 0.2319F, -1.6413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8181F, -0.4726F, -1.6144F, -0.0524F, 0.0F));

		PartDefinition cube_r47 = jaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(9, 90).mirror().addBox(-0.275F, 0.6325F, -1.7064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8181F, -0.4726F, -1.5446F, -0.0524F, 0.0F));

		PartDefinition cube_r48 = jaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(93, 94).mirror().addBox(-0.5F, -0.4F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(87, 75).mirror().addBox(-0.5F, 0.0F, -0.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-0.2389F, 0.1456F, -1.1475F, 0.1309F, -0.0524F, 0.0F));

		PartDefinition cube_r49 = jaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(16, 90).mirror().addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.2389F, 0.1456F, -1.1475F, -0.5672F, -0.0524F, 0.0F));

		PartDefinition cube_r50 = jaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(97, 24).mirror().addBox(-0.5F, -0.5952F, -0.5324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.1724F, -0.676F, -1.1088F, -2.2952F, -0.0522F, 0.0037F));

		PartDefinition cube_r51 = jaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(10, 97).mirror().addBox(-0.5F, -0.4035F, -0.5281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-0.1724F, -0.676F, -1.1088F, -1.6843F, -0.0522F, 0.0037F));

		PartDefinition cube_r52 = jaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(22, 82).mirror().addBox(-0.675F, -0.2431F, -2.6913F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0475F, 0.6684F, -3.2684F, 3.0543F, -0.0524F, 0.0F));

		PartDefinition cube_r53 = jaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(82, 41).mirror().addBox(0.025F, -1.2681F, -0.5913F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-0.7535F, -0.622F, -1.3595F, -3.0107F, -0.0524F, 0.0F));

		PartDefinition cube_r54 = jaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(82, 46).mirror().addBox(0.025F, -0.8181F, -0.4413F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7535F, -0.622F, -1.3595F, -2.8362F, -0.0524F, 0.0F));

		PartDefinition cube_r55 = jaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(23, 90).mirror().addBox(-0.275F, -0.2626F, -1.6836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)).mirror(false), PartPose.offsetAndRotation(-0.8F, 0.8181F, -0.4726F, -1.5272F, -0.0524F, 0.0F));

		PartDefinition cube_r56 = jaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(99, 54).mirror().addBox(-0.5F, 0.225F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(99, 57).mirror().addBox(-0.5F, -0.275F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(99, 54).addBox(1.65F, 0.225F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(99, 57).addBox(1.65F, -0.275F, -0.225F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(-0.575F, -0.2814F, 0.4429F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r57 = jaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(98, 36).mirror().addBox(-0.5F, -0.275F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)).mirror(false)
				.texOffs(98, 36).addBox(1.65F, -0.275F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.575F, 0.025F, 0.7F, -0.8727F, 0.0F, 0.0F));

		PartDefinition cube_r58 = jaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(93, 91).addBox(-0.725F, -0.6725F, -0.4146F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.8F, 0.8181F, -0.4726F, 0.7854F, 0.0524F, 0.0F));

		PartDefinition cube_r59 = jaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(43, 87).addBox(-0.725F, 1.7931F, -1.0501F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.8F, 0.8181F, -0.4726F, -1.7541F, 0.0524F, 0.0F));

		PartDefinition cube_r60 = jaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(98, 94).addBox(-0.725F, 1.2976F, 0.6838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(85, 98).addBox(-0.725F, 1.4976F, 0.6838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(94, 85).addBox(-0.725F, 1.4976F, 0.1838F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.8F, 0.8181F, -0.4726F, -2.6267F, 0.0524F, 0.0F));

		PartDefinition cube_r61 = jaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(98, 48).addBox(-0.725F, 1.1037F, 0.593F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(94, 82).addBox(-0.725F, 1.1037F, 0.293F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.243F)), PartPose.offsetAndRotation(1.8F, 0.8181F, -0.4726F, -3.0631F, 0.0524F, 0.0F));

		PartDefinition cube_r62 = jaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(60, 96).addBox(-0.725F, 1.2078F, -0.7027F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.8F, 0.8181F, -0.4726F, -2.714F, 0.0524F, 0.0F));

		PartDefinition cube_r63 = jaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(96, 3).addBox(-0.725F, 1.023F, -0.9601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.258F))
				.texOffs(96, 0).addBox(-0.725F, 0.548F, -0.9601F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.8F, 0.8181F, -0.4726F, -2.5744F, 0.0524F, 0.0F));

		PartDefinition cube_r64 = jaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(58, 93).addBox(-0.725F, 1.5848F, -0.8343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F))
				.texOffs(63, 93).addBox(-0.725F, 2.0848F, -0.3343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(79, 89).addBox(-0.725F, 1.5848F, -0.3343F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.8F, 0.8181F, -0.4726F, -1.7628F, 0.0524F, 0.0F));

		PartDefinition cube_r65 = jaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(87, 19).addBox(-2.475F, -0.225F, -0.75F, 3.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(1.475F, 0.4927F, -3.0425F, -1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r66 = jaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(68, 93).addBox(-0.725F, 1.4903F, -2.0926F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(1.8F, 0.8181F, -0.4726F, -1.1519F, 0.0524F, 0.0F));

		PartDefinition cube_r67 = jaw.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(87, 63).addBox(-0.725F, 1.1261F, -1.61F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.245F))
				.texOffs(65, 89).addBox(-1.025F, 0.2319F, -1.6413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.248F))
				.texOffs(58, 89).addBox(-0.725F, 0.2319F, -1.6413F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(1.8F, 0.8181F, -0.4726F, -1.6144F, 0.0524F, 0.0F));

		PartDefinition cube_r68 = jaw.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(9, 90).addBox(-0.725F, 0.6325F, -1.7064F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.8F, 0.8181F, -0.4726F, -1.5446F, 0.0524F, 0.0F));

		PartDefinition cube_r69 = jaw.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(93, 94).addBox(-0.5F, -0.4F, -0.075F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(87, 75).addBox(-0.5F, 0.0F, -0.275F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(1.2389F, 0.1456F, -1.1475F, 0.1309F, 0.0524F, 0.0F));

		PartDefinition cube_r70 = jaw.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(16, 90).addBox(-0.5F, -1.0F, -0.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.2389F, 0.1456F, -1.1475F, -0.5672F, 0.0524F, 0.0F));

		PartDefinition cube_r71 = jaw.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(97, 24).addBox(-0.5F, -0.5952F, -0.5324F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.1724F, -0.676F, -1.1088F, -2.2952F, 0.0522F, -0.0037F));

		PartDefinition cube_r72 = jaw.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(10, 97).addBox(-0.5F, -0.4035F, -0.5281F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(1.1724F, -0.676F, -1.1088F, -1.6843F, 0.0522F, -0.0037F));

		PartDefinition cube_r73 = jaw.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(22, 82).addBox(-0.325F, -0.2431F, -2.6913F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.9525F, 0.6684F, -3.2684F, 3.0543F, 0.0524F, 0.0F));

		PartDefinition cube_r74 = jaw.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(82, 41).addBox(-1.025F, -1.2681F, -0.5913F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(1.7535F, -0.622F, -1.3595F, -3.0107F, 0.0524F, 0.0F));

		PartDefinition cube_r75 = jaw.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(82, 46).addBox(-1.025F, -0.8181F, -0.4413F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(1.7535F, -0.622F, -1.3595F, -2.8362F, 0.0524F, 0.0F));

		PartDefinition cube_r76 = jaw.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(23, 90).addBox(-0.725F, -0.2626F, -1.6836F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(1.8F, 0.8181F, -0.4726F, -1.5272F, 0.0524F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.1F, -1.0256F, -1.8393F));

		PartDefinition cube_r77 = leftFace.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(72, 89).addBox(0.65F, -0.55F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)), PartPose.offsetAndRotation(-0.1F, 1.063F, -0.0175F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r78 = leftFace.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(91, 51).addBox(-1.5F, -0.6912F, 0.7962F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F))
				.texOffs(91, 48).addBox(-1.5F, -0.6912F, 0.4962F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7885F, 1.5112F, -2.7175F, 0.4913F, 0.2091F, -0.0111F));

		PartDefinition cube_r79 = leftFace.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(43, 90).addBox(-1.5F, -1.1174F, 0.8801F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)), PartPose.offsetAndRotation(0.7885F, 1.5112F, -2.7175F, 0.1073F, 0.2091F, -0.0111F));

		PartDefinition cube_r80 = leftFace.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(91, 45).addBox(-1.5F, -1.0539F, 0.9586F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7885F, 1.5112F, -2.7175F, 0.2295F, 0.2091F, -0.0111F));

		PartDefinition cube_r81 = leftFace.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(91, 42).addBox(-1.5F, -1.0287F, 0.6347F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)), PartPose.offsetAndRotation(0.7885F, 1.5112F, -2.7175F, 0.1771F, 0.2091F, -0.0111F));

		PartDefinition cube_r82 = leftFace.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(35, 96).addBox(-0.5F, -0.5F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F))
				.texOffs(96, 21).addBox(-0.5F, -0.5F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(96, 18).addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7885F, 1.5112F, -2.7175F, 0.7094F, 0.2091F, -0.0111F));

		PartDefinition cube_r83 = leftFace.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(40, 96).addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.7885F, 1.5112F, -2.7175F, 0.884F, 0.2091F, -0.0111F));

		PartDefinition cube_r84 = leftFace.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(30, 94).addBox(-0.725F, -0.5675F, -1.4252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.75F, 0.9674F, -2.751F, 1.4742F, -0.0218F, -0.3397F));

		PartDefinition cube_r85 = leftFace.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(20, 94).addBox(-0.725F, -0.5675F, -1.4252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F))
				.texOffs(25, 94).addBox(-1.125F, -0.5675F, -1.4252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.75F, 0.9674F, -2.751F, 1.3216F, -0.0752F, -0.3323F));

		PartDefinition cube_r86 = leftFace.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(88, 95).addBox(-0.775F, -0.2422F, -0.6488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.75F, 0.9674F, -2.751F, 0.8284F, -0.0218F, -0.3397F));

		PartDefinition cube_r87 = leftFace.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(96, 9).addBox(-0.725F, -0.4802F, -1.0526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)), PartPose.offsetAndRotation(0.75F, 0.9674F, -2.751F, 1.352F, -0.0218F, -0.3397F));

		PartDefinition cube_r88 = leftFace.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(83, 95).addBox(-0.775F, -0.2422F, -0.6488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)), PartPose.offsetAndRotation(0.75F, 0.9674F, -2.751F, 0.6758F, -0.0752F, -0.3323F));

		PartDefinition cube_r89 = leftFace.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(96, 6).addBox(-0.725F, -0.4802F, -1.0526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.75F, 0.9674F, -2.751F, 1.1994F, -0.0752F, -0.3323F));

		PartDefinition cube_r90 = leftFace.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(50, 96).addBox(-0.7F, -0.425F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)), PartPose.offsetAndRotation(0.1F, 1.2688F, -2.876F, 1.1444F, -0.9195F, -1.0518F));

		PartDefinition cube_r91 = leftFace.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(45, 96).addBox(-0.25F, -0.275F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2416F, 0.8866F, -2.9347F, 1.3969F, -0.2705F, 0.4805F));

		PartDefinition cube_r92 = leftFace.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(94, 73).addBox(-0.725F, -0.2387F, -0.2342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.2717F, 0.3808F, -2.2081F, 0.1251F, 0.1279F, -0.972F));

		PartDefinition cube_r93 = leftFace.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(94, 66).addBox(-0.725F, -0.2137F, -0.7342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F))
				.texOffs(94, 63).addBox(-0.725F, -0.2137F, -1.0092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(94, 60).addBox(-0.85F, -0.1637F, -1.0342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F))
				.texOffs(94, 57).addBox(-0.85F, -0.1637F, -0.8342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.25F, 0.3704F, -2.2148F, 0.3096F, 0.4963F, -0.9739F));

		PartDefinition cube_r94 = leftFace.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(94, 54).addBox(-0.85F, -0.1637F, -0.1342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.25F, 0.3704F, -2.2148F, 0.0897F, 0.1923F, -1.0045F));

		PartDefinition cube_r95 = leftFace.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(30, 97).addBox(-0.7215F, -0.5105F, -0.4424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.1517F, 0.2915F, 1.7301F, 0.0995F, 1.4183F, -0.2231F));

		PartDefinition cube_r96 = leftFace.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(98, 91).addBox(-0.3F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(98, 97).addBox(-0.6F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)), PartPose.offsetAndRotation(1.3065F, 0.2295F, 1.688F, 3.0879F, 1.2858F, 2.7687F));

		PartDefinition cube_r97 = leftFace.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(50, 99).addBox(-0.5221F, -0.5F, -0.5141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(0.7891F, 0.049F, 1.6854F, -2.8194F, -0.0808F, 1.5695F));

		PartDefinition cube_r98 = leftFace.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(97, 30).addBox(-0.2971F, -0.5F, -0.4141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(97, 33).addBox(-0.5971F, -0.5F, -0.4141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(0.7891F, 0.049F, 1.6854F, -2.7921F, 0.3982F, 1.7368F));

		PartDefinition cube_r99 = leftFace.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(35, 99).addBox(-0.2971F, -0.5F, -0.4141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F))
				.texOffs(40, 99).addBox(-0.5971F, -0.5F, -0.4141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)), PartPose.offsetAndRotation(1.3391F, 0.199F, 1.4604F, -3.0409F, 0.2159F, 2.7982F));

		PartDefinition cube_r100 = leftFace.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(45, 99).addBox(-0.5221F, -0.5F, -0.5141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.3391F, 0.199F, 1.4604F, -3.039F, -0.2877F, 2.7474F));

		PartDefinition cube_r101 = leftFace.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(76, 85).addBox(-1.275F, -0.625F, -1.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)), PartPose.offsetAndRotation(1.2219F, 0.2898F, 0.1699F, 0.2024F, 1.1504F, -0.574F));

		PartDefinition cube_r102 = leftFace.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(50, 90).addBox(-0.4608F, -0.2432F, -0.623F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.0043F, 0.375F, 0.175F, 0.1043F, 0.0092F));

		PartDefinition cube_r103 = leftFace.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(98, 69).addBox(0.7208F, -0.4266F, 1.2335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F))
				.texOffs(98, 51).addBox(0.7208F, -0.4266F, 0.8335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.158F, -0.1213F, 0.011F));

		PartDefinition cube_r104 = leftFace.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(98, 42).addBox(0.6413F, -0.3229F, 0.5426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F))
				.texOffs(98, 45).addBox(0.1413F, -0.3229F, 0.5426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0698F, -0.0524F, 0.0F));

		PartDefinition cube_r105 = leftFace.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(70, 96).addBox(-0.4F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.254F)), PartPose.offsetAndRotation(-0.1F, 0.8507F, -2.9525F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r106 = leftFace.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(80, 98).addBox(-0.475F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7722F, 0.3302F, 1.6583F, -0.2041F, -0.9346F, 0.2563F));

		PartDefinition cube_r107 = leftFace.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(65, 96).addBox(-0.5F, -0.45F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)), PartPose.offsetAndRotation(0.4F, 1.3378F, -2.9802F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r108 = leftFace.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(75, 98).addBox(-0.75F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.7722F, 0.3302F, 1.6583F, -0.1924F, -0.9808F, 0.2415F));

		PartDefinition cube_r109 = leftFace.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(98, 39).addBox(-0.6F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.5866F, 0.2494F, 1.0599F, -0.0976F, 0.7742F, -0.072F));

		PartDefinition cube_r110 = leftFace.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(37, 93).addBox(-0.5F, -0.2326F, 0.2497F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, 0.1047F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.1F, -1.0256F, -1.8393F));

		PartDefinition cube_r111 = rightFace.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(72, 89).mirror().addBox(-1.65F, -0.55F, -1.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.303F)).mirror(false), PartPose.offsetAndRotation(0.1F, 1.063F, -0.0175F, 2.1468F, 0.0F, 0.0F));

		PartDefinition cube_r112 = rightFace.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(91, 51).mirror().addBox(-0.5F, -0.6912F, 0.7962F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false)
				.texOffs(91, 48).mirror().addBox(-0.5F, -0.6912F, 0.4962F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7885F, 1.5112F, -2.7175F, 0.4913F, -0.2091F, 0.0111F));

		PartDefinition cube_r113 = rightFace.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(43, 90).mirror().addBox(-0.5F, -1.1174F, 0.8801F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.353F)).mirror(false), PartPose.offsetAndRotation(-0.7885F, 1.5112F, -2.7175F, 0.1073F, -0.2091F, 0.0111F));

		PartDefinition cube_r114 = rightFace.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(91, 45).mirror().addBox(-0.5F, -1.0539F, 0.9586F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7885F, 1.5112F, -2.7175F, 0.2295F, -0.2091F, 0.0111F));

		PartDefinition cube_r115 = rightFace.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(91, 42).mirror().addBox(-0.5F, -1.0287F, 0.6347F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.355F)).mirror(false), PartPose.offsetAndRotation(-0.7885F, 1.5112F, -2.7175F, 0.1771F, -0.2091F, 0.0111F));

		PartDefinition cube_r116 = rightFace.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(35, 96).mirror().addBox(-0.5F, -0.5F, 0.25F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false)
				.texOffs(96, 21).mirror().addBox(-0.5F, -0.5F, -0.05F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(96, 18).mirror().addBox(-0.5F, -0.5F, -0.35F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7885F, 1.5112F, -2.7175F, 0.7094F, -0.2091F, 0.0111F));

		PartDefinition cube_r117 = rightFace.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(40, 96).mirror().addBox(-0.5F, -0.5F, -0.625F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.7885F, 1.5112F, -2.7175F, 0.884F, -0.2091F, 0.0111F));

		PartDefinition cube_r118 = rightFace.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(30, 94).mirror().addBox(-0.275F, -0.5675F, -1.4252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.9674F, -2.751F, 1.4742F, 0.0218F, 0.3397F));

		PartDefinition cube_r119 = rightFace.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(20, 94).mirror().addBox(-0.275F, -0.5675F, -1.4252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.297F)).mirror(false)
				.texOffs(25, 94).mirror().addBox(0.125F, -0.5675F, -1.4252F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.9674F, -2.751F, 1.3216F, 0.0752F, 0.3323F));

		PartDefinition cube_r120 = rightFace.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(88, 95).mirror().addBox(-0.225F, -0.2422F, -0.6488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.9674F, -2.751F, 0.8284F, 0.0218F, 0.3397F));

		PartDefinition cube_r121 = rightFace.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(96, 9).mirror().addBox(-0.275F, -0.4802F, -1.0526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.304F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.9674F, -2.751F, 1.352F, 0.0218F, 0.3397F));

		PartDefinition cube_r122 = rightFace.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(83, 95).mirror().addBox(-0.225F, -0.2422F, -0.6488F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.245F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.9674F, -2.751F, 0.6758F, 0.0752F, 0.3323F));

		PartDefinition cube_r123 = rightFace.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(96, 6).mirror().addBox(-0.275F, -0.4802F, -1.0526F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.75F, 0.9674F, -2.751F, 1.1994F, 0.0752F, 0.3323F));

		PartDefinition cube_r124 = rightFace.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(50, 96).mirror().addBox(-0.3F, -0.425F, -0.725F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.3F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 1.2688F, -2.876F, 1.1444F, 0.9195F, 1.0518F));

		PartDefinition cube_r125 = rightFace.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(45, 96).mirror().addBox(-0.75F, -0.275F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2416F, 0.8866F, -2.9347F, 1.3969F, 0.2705F, -0.4805F));

		PartDefinition cube_r126 = rightFace.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(94, 73).mirror().addBox(-0.275F, -0.2387F, -0.2342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.2717F, 0.3808F, -2.2081F, 0.1251F, -0.1279F, 0.972F));

		PartDefinition cube_r127 = rightFace.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(94, 66).mirror().addBox(-0.275F, -0.2137F, -0.7342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.248F)).mirror(false)
				.texOffs(94, 63).mirror().addBox(-0.275F, -0.2137F, -1.0092F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(94, 60).mirror().addBox(-0.15F, -0.1637F, -1.0342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.154F)).mirror(false)
				.texOffs(94, 57).mirror().addBox(-0.15F, -0.1637F, -0.8342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 0.3704F, -2.2148F, 0.3096F, -0.4963F, 0.9739F));

		PartDefinition cube_r128 = rightFace.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(94, 54).mirror().addBox(-0.15F, -0.1637F, -0.1342F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.25F, 0.3704F, -2.2148F, 0.0897F, -0.1923F, 1.0045F));

		PartDefinition cube_r129 = rightFace.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(30, 97).mirror().addBox(-0.2785F, -0.5105F, -0.4424F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.1517F, 0.2915F, 1.7301F, 0.0995F, -1.4183F, 0.2231F));

		PartDefinition cube_r130 = rightFace.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(98, 91).mirror().addBox(-0.7F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(98, 97).mirror().addBox(-0.4F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.354F)).mirror(false), PartPose.offsetAndRotation(-1.3065F, 0.2295F, 1.688F, 3.0879F, -1.2858F, -2.7687F));

		PartDefinition cube_r131 = rightFace.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(50, 99).mirror().addBox(-0.4779F, -0.5F, -0.5141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-0.7891F, 0.049F, 1.6854F, -2.8194F, 0.0808F, -1.5695F));

		PartDefinition cube_r132 = rightFace.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(97, 30).mirror().addBox(-0.7029F, -0.5F, -0.4141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(97, 33).mirror().addBox(-0.4029F, -0.5F, -0.4141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-0.7891F, 0.049F, 1.6854F, -2.7921F, -0.3982F, -1.7368F));

		PartDefinition cube_r133 = rightFace.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(35, 99).mirror().addBox(-0.7029F, -0.5F, -0.4141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false)
				.texOffs(40, 99).mirror().addBox(-0.4029F, -0.5F, -0.4141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.347F)).mirror(false), PartPose.offsetAndRotation(-1.3391F, 0.199F, 1.4604F, -3.0409F, -0.2159F, -2.7982F));

		PartDefinition cube_r134 = rightFace.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(45, 99).mirror().addBox(-0.4779F, -0.5F, -0.5141F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.3391F, 0.199F, 1.4604F, -3.039F, 0.2877F, -2.7474F));

		PartDefinition cube_r135 = rightFace.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(76, 85).mirror().addBox(-0.725F, -0.625F, -1.375F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.35F)).mirror(false), PartPose.offsetAndRotation(-1.2219F, 0.2898F, 0.1699F, 0.2024F, -1.1504F, 0.574F));

		PartDefinition cube_r136 = rightFace.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(50, 90).mirror().addBox(-1.5392F, -0.2432F, -0.623F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0043F, 0.375F, 0.175F, -0.1043F, -0.0092F));

		PartDefinition cube_r137 = rightFace.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(98, 69).mirror().addBox(-1.7208F, -0.4266F, 1.2335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.246F)).mirror(false)
				.texOffs(98, 51).mirror().addBox(-1.7208F, -0.4266F, 0.8335F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.158F, 0.1213F, -0.011F));

		PartDefinition cube_r138 = rightFace.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(98, 42).mirror().addBox(-1.6413F, -0.3229F, 0.5426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false)
				.texOffs(98, 45).mirror().addBox(-1.1413F, -0.3229F, 0.5426F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.255F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0698F, 0.0524F, 0.0F));

		PartDefinition cube_r139 = rightFace.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(70, 96).mirror().addBox(-0.6F, -0.25F, -0.75F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.1F, 0.8507F, -2.9525F, 1.501F, 0.0F, 0.0F));

		PartDefinition cube_r140 = rightFace.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(80, 98).mirror().addBox(-0.525F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7722F, 0.3302F, 1.6583F, -0.2041F, 0.9346F, -0.2563F));

		PartDefinition cube_r141 = rightFace.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(65, 96).mirror().addBox(-0.5F, -0.45F, -0.7F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.296F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 1.3378F, -2.9802F, 0.672F, 0.0F, 0.0F));

		PartDefinition cube_r142 = rightFace.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(75, 98).mirror().addBox(-0.25F, -0.5F, -0.575F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.7722F, 0.3302F, 1.6583F, -0.1924F, 0.9808F, -0.2415F));

		PartDefinition cube_r143 = rightFace.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(98, 39).mirror().addBox(-0.4F, -0.5F, -0.675F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(-0.5866F, 0.2494F, 1.0599F, -0.0976F, -0.7742F, 0.072F));

		PartDefinition cube_r144 = rightFace.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(37, 93).mirror().addBox(-1.5F, -0.2326F, 0.2497F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.25F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0349F, -0.1047F, 0.0F));

		PartDefinition frontleftleg = shell.addOrReplaceChild("frontleftleg", CubeListBuilder.create().texOffs(0, 82).addBox(-0.4F, -0.2F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.4098F, -0.8688F, -5.4915F, 0.1491F, -0.5997F, -0.0396F));

		PartDefinition cube_r145 = frontleftleg.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(78, 95).addBox(-1.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.1F, 0.3F, -0.4F, 0.0F, -0.6981F, 0.0F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3695F, 0.5F, -2.7298F, 0.8733F, -0.9938F, -0.9328F));

		PartDefinition cube_r146 = frontleftleg2.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(82, 51).addBox(-1.2F, -0.2F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.6F, -0.05F, -3.2F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r147 = frontleftleg2.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(58, 82).addBox(-0.4F, -0.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.25F, -1.2F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r148 = frontleftleg2.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(0, 94).addBox(-0.4F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(74, 26).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9506F, -0.25F, -1.0744F, 0.0F, 0.2967F, 0.0F));

		PartDefinition cube_r149 = frontleftleg2.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(36, 87).addBox(-0.65F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2637F, -0.25F, -0.9857F, 0.0F, 0.2618F, 0.0F));

		PartDefinition frontrightleg = shell.addOrReplaceChild("frontrightleg", CubeListBuilder.create().texOffs(0, 82).mirror().addBox(-0.6F, -0.2F, -2.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)).mirror(false), PartPose.offsetAndRotation(-0.4098F, -0.8688F, -5.4915F, 0.1286F, 0.2971F, -0.0071F));

		PartDefinition cube_r150 = frontrightleg.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(78, 95).mirror().addBox(0.0F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)).mirror(false), PartPose.offsetAndRotation(-0.1F, 0.3F, -0.4F, 0.0F, 0.6981F, 0.0F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3694F, 0.5F, -2.7298F, 0.3972F, 0.5904F, 0.6459F));

		PartDefinition cube_r151 = frontrightleg2.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(82, 51).mirror().addBox(-0.8F, -0.2F, -0.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.05F, -3.2F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r152 = frontrightleg2.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(58, 82).mirror().addBox(-0.6F, -0.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.25F, -1.2F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r153 = frontrightleg2.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(0, 94).mirror().addBox(-0.6F, -0.5F, -1.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(74, 26).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9506F, -0.25F, -1.0744F, 0.0F, -0.2967F, 0.0F));

		PartDefinition cube_r154 = frontrightleg2.addOrReplaceChild("cube_r154", CubeListBuilder.create().texOffs(36, 87).mirror().addBox(-0.35F, -0.5F, -1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2638F, -0.25F, -0.9857F, 0.0F, -0.2618F, 0.0F));

		PartDefinition backleftleg = shell.addOrReplaceChild("backleftleg", CubeListBuilder.create().texOffs(81, 31).addBox(-0.1735F, -0.6357F, -0.3877F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.2398F, -0.263F, 7.6647F, -0.2685F, 0.8908F, -0.2229F));

		PartDefinition frontleftleg3 = backleftleg.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2717F, -0.5058F, 2.7352F, 2.8292F, -0.7738F, 0.4939F));

		PartDefinition cube_r155 = frontleftleg3.addOrReplaceChild("cube_r155", CubeListBuilder.create().texOffs(49, 82).addBox(-1.2F, -1.1F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)), PartPose.offsetAndRotation(-0.6F, -0.05F, -3.2F, -0.2182F, 0.1745F, 0.0F));

		PartDefinition cube_r156 = frontleftleg3.addOrReplaceChild("cube_r156", CubeListBuilder.create().texOffs(11, 77).addBox(-0.4F, -0.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.2F, -0.25F, -1.2F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r157 = frontleftleg3.addOrReplaceChild("cube_r157", CubeListBuilder.create().texOffs(87, 55).addBox(-0.2F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.2296F, -0.25F, -1.3028F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r158 = frontleftleg3.addOrReplaceChild("cube_r158", CubeListBuilder.create().texOffs(87, 59).addBox(-0.4F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(-0.9506F, -0.25F, -1.0744F, 0.0F, 0.2967F, 0.0F));

		PartDefinition cube_r159 = frontleftleg3.addOrReplaceChild("cube_r159", CubeListBuilder.create().texOffs(81, 26).addBox(-0.625F, -0.5F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)), PartPose.offsetAndRotation(0.2638F, -0.25F, -0.9857F, 0.0F, 0.2007F, 0.0F));

		PartDefinition backrightleg = shell.addOrReplaceChild("backrightleg", CubeListBuilder.create().texOffs(81, 31).mirror().addBox(-0.8265F, -0.6357F, -0.3877F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.2398F, -0.263F, 7.6647F, -0.3751F, -1.0981F, 0.3494F));

		PartDefinition frontrightleg3 = backrightleg.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2717F, -0.5058F, 2.7352F, 2.8606F, 0.4478F, -0.588F));

		PartDefinition cube_r160 = frontrightleg3.addOrReplaceChild("cube_r160", CubeListBuilder.create().texOffs(49, 82).mirror().addBox(-0.8F, -1.1F, -1.9F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.01F)).mirror(false), PartPose.offsetAndRotation(0.6F, -0.05F, -3.2F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r161 = frontrightleg3.addOrReplaceChild("cube_r161", CubeListBuilder.create().texOffs(11, 77).mirror().addBox(-0.6F, -0.5F, 0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(-0.2F, -0.25F, -1.2F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r162 = frontrightleg3.addOrReplaceChild("cube_r162", CubeListBuilder.create().texOffs(87, 55).mirror().addBox(-0.8F, -0.5F, -1.8F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.204F)).mirror(false), PartPose.offsetAndRotation(1.2296F, -0.25F, -1.3028F, 0.0F, -0.1745F, 0.0F));

		PartDefinition cube_r163 = frontrightleg3.addOrReplaceChild("cube_r163", CubeListBuilder.create().texOffs(87, 59).mirror().addBox(-0.6F, -0.5F, -0.5F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)).mirror(false), PartPose.offsetAndRotation(0.9506F, -0.25F, -1.0744F, 0.0F, -0.2967F, 0.0F));

		PartDefinition cube_r164 = frontrightleg3.addOrReplaceChild("cube_r164", CubeListBuilder.create().texOffs(81, 26).mirror().addBox(-0.375F, -0.5F, -2.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.198F)).mirror(false), PartPose.offsetAndRotation(-0.2637F, -0.25F, -0.9857F, 0.0F, -0.2007F, 0.0F));

		PartDefinition leftShell = shell.addOrReplaceChild("leftShell", CubeListBuilder.create(), PartPose.offset(1.5F, -0.5F, 0.5F));

		PartDefinition cube_r165 = leftShell.addOrReplaceChild("cube_r165", CubeListBuilder.create().texOffs(0, 87).addBox(-0.1565F, -0.5F, -1.3886F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F))
				.texOffs(76, 75).addBox(-0.6565F, -0.5F, -1.3886F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)), PartPose.offsetAndRotation(10.1446F, 0.2151F, 7.2919F, 3.1365F, 0.9337F, 0.1007F));

		PartDefinition cube_r166 = leftShell.addOrReplaceChild("cube_r166", CubeListBuilder.create().texOffs(74, 80).addBox(-1.9276F, -0.5F, -1.5448F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(10.1446F, 0.2151F, 7.2919F, 3.1382F, 0.4537F, 0.1033F));

		PartDefinition cube_r167 = leftShell.addOrReplaceChild("cube_r167", CubeListBuilder.create().texOffs(85, 80).addBox(-5.2057F, -0.5152F, -5.9682F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(9.6626F, 0.1616F, 0.9726F, 0.0F, -0.8639F, 0.096F));

		PartDefinition cube_r168 = leftShell.addOrReplaceChild("cube_r168", CubeListBuilder.create().texOffs(63, 80).addBox(-3.8268F, -0.5152F, -7.6401F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)), PartPose.offsetAndRotation(9.6626F, 0.1616F, 0.9726F, 0.0F, -0.384F, 0.096F));

		PartDefinition cube_r169 = leftShell.addOrReplaceChild("cube_r169", CubeListBuilder.create().texOffs(63, 70).addBox(-1.4388F, -0.525F, 2.1539F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.6626F, 0.1616F, 0.9726F, -0.0039F, -0.1744F, 0.0965F));

		PartDefinition cube_r170 = leftShell.addOrReplaceChild("cube_r170", CubeListBuilder.create().texOffs(43, 30).addBox(-0.8507F, -0.5152F, -2.2726F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F))
				.texOffs(0, 38).addBox(-3.6507F, -0.5152F, -8.4726F, 3.0F, 1.0F, 17.0F, new CubeDeformation(0.015F)), PartPose.offsetAndRotation(9.6626F, 0.1616F, 0.9726F, 0.0F, 0.0F, 0.096F));

		PartDefinition cube_r171 = leftShell.addOrReplaceChild("cube_r171", CubeListBuilder.create().texOffs(29, 70).addBox(-0.4986F, -0.5152F, -5.752F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(9.6626F, 0.1616F, 0.9726F, 0.0F, 0.1745F, 0.096F));

		PartDefinition cube_r172 = leftShell.addOrReplaceChild("cube_r172", CubeListBuilder.create().texOffs(82, 36).addBox(0.1128F, -0.5F, -1.7467F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.8049F, -0.7964F, -5.508F, -0.0237F, 0.3063F, 0.0772F));

		PartDefinition cube_r173 = leftShell.addOrReplaceChild("cube_r173", CubeListBuilder.create().texOffs(63, 75).addBox(-2.1596F, -0.5F, -1.5354F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.8049F, -0.7964F, -5.508F, -0.0306F, 0.7425F, 0.0636F));

		PartDefinition cube_r174 = leftShell.addOrReplaceChild("cube_r174", CubeListBuilder.create().texOffs(29, 57).addBox(0.0F, 0.0F, -4.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -1.5F, -0.5F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r175 = leftShell.addOrReplaceChild("cube_r175", CubeListBuilder.create().texOffs(85, 84).addBox(-1.225F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.0348F, -0.8173F, 6.6462F, 0.0325F, 1.0914F, 0.1161F));

		PartDefinition cube_r176 = leftShell.addOrReplaceChild("cube_r176", CubeListBuilder.create().texOffs(74, 14).addBox(-0.0351F, 0.0768F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4013F, -1.3198F, 9.5F, 0.0204F, 0.7424F, 0.101F));

		PartDefinition cube_r177 = leftShell.addOrReplaceChild("cube_r177", CubeListBuilder.create().texOffs(0, 0).addBox(-0.0351F, 0.0768F, -7.0F, 4.0F, 1.0F, 17.0F, new CubeDeformation(0.009F)), PartPose.offsetAndRotation(2.4013F, -1.3198F, -0.5F, 0.0F, 0.0F, 0.1484F));

		PartDefinition rightShell = shell.addOrReplaceChild("rightShell", CubeListBuilder.create(), PartPose.offset(-0.5F, -0.5F, 0.5F));

		PartDefinition cube_r178 = rightShell.addOrReplaceChild("cube_r178", CubeListBuilder.create().texOffs(0, 87).mirror().addBox(-1.8435F, -0.5F, -1.3886F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false)
				.texOffs(76, 75).mirror().addBox(-1.3435F, -0.5F, -1.3886F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.015F)).mirror(false), PartPose.offsetAndRotation(-10.1446F, 0.2151F, 7.2919F, 3.1365F, -0.9337F, -0.1007F));

		PartDefinition cube_r179 = rightShell.addOrReplaceChild("cube_r179", CubeListBuilder.create().texOffs(74, 80).mirror().addBox(-0.0724F, -0.5F, -1.5448F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-10.1446F, 0.2151F, 7.2919F, 3.1382F, -0.4537F, -0.1033F));

		PartDefinition cube_r180 = rightShell.addOrReplaceChild("cube_r180", CubeListBuilder.create().texOffs(85, 80).mirror().addBox(3.2057F, -0.5152F, -5.9682F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-9.6626F, 0.1616F, 0.9726F, 0.0F, 0.8639F, -0.096F));

		PartDefinition cube_r181 = rightShell.addOrReplaceChild("cube_r181", CubeListBuilder.create().texOffs(63, 80).mirror().addBox(1.8268F, -0.5152F, -7.6401F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.014F)).mirror(false), PartPose.offsetAndRotation(-9.6626F, 0.1616F, 0.9726F, 0.0F, 0.384F, -0.096F));

		PartDefinition cube_r182 = rightShell.addOrReplaceChild("cube_r182", CubeListBuilder.create().texOffs(63, 70).mirror().addBox(-3.5612F, -0.525F, 2.1539F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.6626F, 0.1616F, 0.9726F, -0.0039F, 0.1744F, -0.0965F));

		PartDefinition cube_r183 = rightShell.addOrReplaceChild("cube_r183", CubeListBuilder.create().texOffs(43, 30).mirror().addBox(-3.1493F, -0.5152F, -2.2726F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(0, 38).mirror().addBox(0.6507F, -0.5152F, -8.4726F, 3.0F, 1.0F, 17.0F, new CubeDeformation(0.015F)).mirror(false), PartPose.offsetAndRotation(-9.6626F, 0.1616F, 0.9726F, 0.0F, 0.0F, -0.096F));

		PartDefinition cube_r184 = rightShell.addOrReplaceChild("cube_r184", CubeListBuilder.create().texOffs(29, 70).mirror().addBox(-3.5014F, -0.5152F, -5.752F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-9.6626F, 0.1616F, 0.9726F, 0.0F, -0.1745F, -0.096F));

		PartDefinition cube_r185 = rightShell.addOrReplaceChild("cube_r185", CubeListBuilder.create().texOffs(82, 36).mirror().addBox(-1.1128F, -0.5F, -1.7467F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.8049F, -0.7964F, -5.508F, -0.0237F, -0.3063F, -0.0772F));

		PartDefinition cube_r186 = rightShell.addOrReplaceChild("cube_r186", CubeListBuilder.create().texOffs(63, 75).mirror().addBox(-0.8404F, -0.5F, -1.5354F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.8049F, -0.7964F, -5.508F, -0.0306F, -0.7425F, -0.0636F));

		PartDefinition cube_r187 = rightShell.addOrReplaceChild("cube_r187", CubeListBuilder.create().texOffs(29, 57).mirror().addBox(-3.0F, 0.0F, -4.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.5F, -1.5F, -0.5F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r188 = rightShell.addOrReplaceChild("cube_r188", CubeListBuilder.create().texOffs(85, 84).mirror().addBox(-0.775F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.0348F, -0.8173F, 6.6462F, 0.0325F, -1.0914F, -0.1161F));

		PartDefinition cube_r189 = rightShell.addOrReplaceChild("cube_r189", CubeListBuilder.create().texOffs(74, 14).mirror().addBox(-1.965F, 0.0768F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4013F, -1.3198F, 9.5F, 0.0204F, -0.7424F, -0.101F));

		PartDefinition cube_r190 = rightShell.addOrReplaceChild("cube_r190", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.965F, 0.0768F, -7.0F, 4.0F, 1.0F, 17.0F, new CubeDeformation(0.009F)).mirror(false), PartPose.offsetAndRotation(-2.4013F, -1.3198F, -0.5F, 0.0F, 0.0F, -0.1484F));

		PartDefinition leftShell2 = shell.addOrReplaceChild("leftShell2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 1.0F, 0.5F, 0.0F, 0.0F, 0.0698F));

		PartDefinition cube_r191 = leftShell2.addOrReplaceChild("cube_r191", CubeListBuilder.create().texOffs(87, 0).addBox(-0.1565F, -0.5F, -1.3886F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F))
				.texOffs(0, 77).addBox(-0.6565F, -0.5F, -1.3886F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(10.2446F, -1.7151F, 7.2919F, -3.1365F, 0.9337F, -0.1007F));

		PartDefinition cube_r192 = leftShell2.addOrReplaceChild("cube_r192", CubeListBuilder.create().texOffs(11, 81).addBox(-1.9276F, -0.5F, -1.5448F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)), PartPose.offsetAndRotation(10.2446F, -1.7151F, 7.2919F, -3.1382F, 0.4537F, -0.1033F));

		PartDefinition cube_r193 = leftShell2.addOrReplaceChild("cube_r193", CubeListBuilder.create().texOffs(49, 86).addBox(-5.2057F, -0.4849F, -5.9682F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(9.7626F, -1.6616F, 0.9726F, 0.0F, -0.8639F, -0.096F));

		PartDefinition cube_r194 = leftShell2.addOrReplaceChild("cube_r194", CubeListBuilder.create().texOffs(80, 70).addBox(-3.8268F, -0.4849F, -7.6401F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.014F)), PartPose.offsetAndRotation(9.7626F, -1.6616F, 0.9726F, 0.0F, -0.384F, -0.096F));

		PartDefinition cube_r195 = leftShell2.addOrReplaceChild("cube_r195", CubeListBuilder.create().texOffs(0, 72).addBox(-1.4388F, -0.475F, 2.1539F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.7626F, -1.6616F, 0.9726F, 0.0039F, -0.1744F, -0.0965F));

		PartDefinition cube_r196 = leftShell2.addOrReplaceChild("cube_r196", CubeListBuilder.create().texOffs(62, 30).addBox(-0.8507F, -0.4849F, -2.2726F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F))
				.texOffs(41, 38).addBox(-3.6507F, -0.4849F, -8.4726F, 3.0F, 1.0F, 17.0F, new CubeDeformation(0.019F)), PartPose.offsetAndRotation(9.7626F, -1.6616F, 0.9726F, 0.0F, 0.0F, -0.096F));

		PartDefinition cube_r197 = leftShell2.addOrReplaceChild("cube_r197", CubeListBuilder.create().texOffs(46, 70).addBox(-0.4986F, -0.4849F, -5.752F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.7626F, -1.6616F, 0.9726F, 0.0F, 0.1745F, -0.096F));

		PartDefinition cube_r198 = leftShell2.addOrReplaceChild("cube_r198", CubeListBuilder.create().texOffs(40, 82).addBox(0.1128F, -0.5F, -1.7467F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)), PartPose.offsetAndRotation(1.9049F, -0.7036F, -5.508F, 0.0237F, 0.3063F, -0.0772F));

		PartDefinition cube_r199 = leftShell2.addOrReplaceChild("cube_r199", CubeListBuilder.create().texOffs(17, 76).addBox(-2.1596F, -0.5F, -1.5354F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.9049F, -0.7036F, -5.508F, 0.0306F, 0.7425F, -0.0636F));

		PartDefinition cube_r200 = leftShell2.addOrReplaceChild("cube_r200", CubeListBuilder.create().texOffs(58, 57).addBox(0.0F, -1.0F, -4.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, 0.0F, -0.5F, 0.0F, 0.0F, -0.0873F));

		PartDefinition cube_r201 = leftShell2.addOrReplaceChild("cube_r201", CubeListBuilder.create().texOffs(9, 86).addBox(-1.225F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(1.1348F, -0.6827F, 6.6462F, -0.0325F, 1.0914F, -0.1161F));

		PartDefinition cube_r202 = leftShell2.addOrReplaceChild("cube_r202", CubeListBuilder.create().texOffs(74, 20).addBox(-0.0351F, -1.0768F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5013F, -0.1802F, 9.5F, -0.0204F, 0.7424F, -0.101F));

		PartDefinition cube_r203 = leftShell2.addOrReplaceChild("cube_r203", CubeListBuilder.create().texOffs(0, 19).addBox(-0.0351F, -1.0768F, -7.0F, 4.0F, 1.0F, 17.0F, new CubeDeformation(0.006F)), PartPose.offsetAndRotation(2.5013F, -0.1802F, -0.5F, 0.0F, 0.0F, -0.1484F));

		PartDefinition rightShell2 = shell.addOrReplaceChild("rightShell2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4F, 1.0F, 0.5F, 0.0F, 0.0F, -0.0698F));

		PartDefinition cube_r204 = rightShell2.addOrReplaceChild("cube_r204", CubeListBuilder.create().texOffs(87, 0).mirror().addBox(-1.8435F, -0.5F, -1.3886F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.015F)).mirror(false)
				.texOffs(0, 77).mirror().addBox(-1.3435F, -0.5F, -1.3886F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-10.2446F, -1.7151F, 7.2919F, -3.1365F, -0.9337F, 0.1007F));

		PartDefinition cube_r205 = rightShell2.addOrReplaceChild("cube_r205", CubeListBuilder.create().texOffs(11, 81).mirror().addBox(-0.0724F, -0.5F, -1.5448F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.008F)).mirror(false), PartPose.offsetAndRotation(-10.2446F, -1.7151F, 7.2919F, -3.1382F, -0.4537F, 0.1033F));

		PartDefinition cube_r206 = rightShell2.addOrReplaceChild("cube_r206", CubeListBuilder.create().texOffs(49, 86).mirror().addBox(3.2057F, -0.4849F, -5.9682F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.01F)).mirror(false), PartPose.offsetAndRotation(-9.7626F, -1.6616F, 0.9726F, 0.0F, 0.8639F, 0.096F));

		PartDefinition cube_r207 = rightShell2.addOrReplaceChild("cube_r207", CubeListBuilder.create().texOffs(80, 70).mirror().addBox(1.8268F, -0.4849F, -7.6401F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.014F)).mirror(false), PartPose.offsetAndRotation(-9.7626F, -1.6616F, 0.9726F, 0.0F, 0.384F, 0.096F));

		PartDefinition cube_r208 = rightShell2.addOrReplaceChild("cube_r208", CubeListBuilder.create().texOffs(0, 72).mirror().addBox(-3.5612F, -0.475F, 2.1539F, 5.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.7626F, -1.6616F, 0.9726F, 0.0039F, 0.1744F, 0.0965F));

		PartDefinition cube_r209 = rightShell2.addOrReplaceChild("cube_r209", CubeListBuilder.create().texOffs(62, 30).mirror().addBox(-3.1493F, -0.4849F, -2.2726F, 4.0F, 1.0F, 5.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(41, 38).mirror().addBox(0.6507F, -0.4849F, -8.4726F, 3.0F, 1.0F, 17.0F, new CubeDeformation(0.019F)).mirror(false), PartPose.offsetAndRotation(-9.7626F, -1.6616F, 0.9726F, 0.0F, 0.0F, 0.096F));

		PartDefinition cube_r210 = rightShell2.addOrReplaceChild("cube_r210", CubeListBuilder.create().texOffs(46, 70).mirror().addBox(-3.5014F, -0.4849F, -5.752F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-9.7626F, -1.6616F, 0.9726F, 0.0F, -0.1745F, 0.096F));

		PartDefinition cube_r211 = rightShell2.addOrReplaceChild("cube_r211", CubeListBuilder.create().texOffs(40, 82).mirror().addBox(-1.1128F, -0.5F, -1.7467F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.006F)).mirror(false), PartPose.offsetAndRotation(-1.9049F, -0.7036F, -5.508F, 0.0237F, -0.3063F, 0.0772F));

		PartDefinition cube_r212 = rightShell2.addOrReplaceChild("cube_r212", CubeListBuilder.create().texOffs(17, 76).mirror().addBox(-0.8404F, -0.5F, -1.5354F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.9049F, -0.7036F, -5.508F, 0.0306F, -0.7425F, 0.0636F));

		PartDefinition cube_r213 = rightShell2.addOrReplaceChild("cube_r213", CubeListBuilder.create().texOffs(58, 57).mirror().addBox(-3.0F, -1.0F, -4.0F, 3.0F, 1.0F, 11.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r214 = rightShell2.addOrReplaceChild("cube_r214", CubeListBuilder.create().texOffs(9, 86).mirror().addBox(-0.775F, -0.5F, -1.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-1.1348F, -0.6827F, 6.6462F, -0.0325F, -1.0914F, 0.1161F));

		PartDefinition cube_r215 = rightShell2.addOrReplaceChild("cube_r215", CubeListBuilder.create().texOffs(74, 20).mirror().addBox(-1.965F, -1.0768F, -4.0F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5013F, -0.1802F, 9.5F, -0.0204F, -0.7424F, 0.101F));

		PartDefinition cube_r216 = rightShell2.addOrReplaceChild("cube_r216", CubeListBuilder.create().texOffs(0, 19).mirror().addBox(-3.965F, -1.0768F, -7.0F, 4.0F, 1.0F, 17.0F, new CubeDeformation(0.006F)).mirror(false), PartPose.offsetAndRotation(-2.5013F, -0.1802F, -0.5F, 0.0F, 0.0F, 0.1484F));

		PartDefinition tail = shell.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(30, 76).addBox(-0.5F, -0.5F, -0.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.0F, 8.0F, -0.0061F, -0.1319F, -0.0857F));

		PartDefinition cube_r217 = tail.addOrReplaceChild("cube_r217", CubeListBuilder.create().texOffs(37, 91).mirror().addBox(-1.2114F, 0.684F, 1.9728F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(82, 55).mirror().addBox(-1.2114F, 0.684F, -0.0272F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.832F, 0.8911F, 0.0807F, 0.1046F, 0.7931F));

		PartDefinition cube_r218 = tail.addOrReplaceChild("cube_r218", CubeListBuilder.create().texOffs(31, 82).mirror().addBox(-0.974F, 0.0337F, -0.0272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.832F, 0.8911F, -0.0173F, 0.1309F, 0.0023F));

		PartDefinition cube_r219 = tail.addOrReplaceChild("cube_r219", CubeListBuilder.create().texOffs(37, 91).addBox(0.2114F, 0.684F, 1.9728F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(82, 55).addBox(0.2114F, 0.684F, -0.0272F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.832F, 0.8911F, 0.0807F, -0.1046F, -0.7931F));

		PartDefinition cube_r220 = tail.addOrReplaceChild("cube_r220", CubeListBuilder.create().texOffs(31, 82).addBox(-0.026F, 0.0337F, -0.0272F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.832F, 0.8911F, -0.0173F, -0.1309F, -0.0023F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(41, 76).addBox(-0.5F, -0.5F, -0.05F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.01F)), PartPose.offsetAndRotation(0.0F, 0.0035F, 3.9501F, 0.0183F, -0.3054F, -0.0055F));

		PartDefinition cube_r221 = tail2.addOrReplaceChild("cube_r221", CubeListBuilder.create().texOffs(99, 60).mirror().addBox(-0.705F, 0.42F, 6.0003F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(60, 99).mirror().addBox(-0.805F, 0.42F, 4.0003F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8355F, -3.0589F, -0.0123F, 0.0123F, 0.7853F));

		PartDefinition cube_r222 = tail2.addOrReplaceChild("cube_r222", CubeListBuilder.create().texOffs(99, 60).addBox(-0.295F, 0.42F, 6.0003F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(60, 99).addBox(-0.195F, 0.42F, 4.0003F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8355F, -3.0589F, -0.0123F, -0.0123F, -0.7853F));

		PartDefinition cube_r223 = tail2.addOrReplaceChild("cube_r223", CubeListBuilder.create().texOffs(52, 76).addBox(-0.5F, 0.1343F, 3.0003F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -0.8355F, -3.0589F, -0.0175F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(74, 0).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.95F, 0.0189F, -0.3926F, -0.0072F));

		PartDefinition cube_r224 = tail3.addOrReplaceChild("cube_r224", CubeListBuilder.create().texOffs(99, 64).mirror().addBox(-0.5465F, 0.3035F, 10.2951F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(99, 62).mirror().addBox(-0.5465F, 0.3035F, 7.9951F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.8355F, -7.0089F, -0.0123F, 0.0123F, 0.7853F));

		PartDefinition cube_r225 = tail3.addOrReplaceChild("cube_r225", CubeListBuilder.create().texOffs(99, 64).addBox(-0.4535F, 0.3035F, 10.2951F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(99, 62).addBox(-0.4535F, 0.3035F, 7.9951F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.8355F, -7.0089F, -0.0123F, -0.0123F, -0.7853F));

		PartDefinition cube_r226 = tail3.addOrReplaceChild("cube_r226", CubeListBuilder.create().texOffs(74, 7).addBox(-0.5F, -0.0658F, 6.9951F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.8355F, -7.0089F, -0.0175F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 104, 104);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.henodus.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		henodus.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}