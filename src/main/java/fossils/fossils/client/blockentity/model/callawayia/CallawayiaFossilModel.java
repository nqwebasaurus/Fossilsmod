package fossils.fossils.client.blockentity.model.callawayia;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CallawayiaFossilModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart backleftflipper;
	private final ModelPart backrightflipper;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart upperbody;
	private final ModelPart chest;
	private final ModelPart frontleftflipper;
	private final ModelPart frontrightflipper;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;

	public CallawayiaFossilModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.backleftflipper = this.main.getChild("backleftflipper");
		this.backrightflipper = this.main.getChild("backrightflipper");
		this.tail = this.main.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.upperbody = this.main.getChild("upperbody");
		this.chest = this.upperbody.getChild("chest");
		this.frontleftflipper = this.chest.getChild("frontleftflipper");
		this.frontrightflipper = this.chest.getChild("frontrightflipper");
		this.neck = this.chest.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, 6.0F, 0.0F, 0.0F, 0.0873F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 46).addBox(0.0F, -0.5F, 1.8F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(8, 46).addBox(0.0F, -0.6F, -0.2F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 50).addBox(-0.5F, 0.0F, -0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.1F, -0.1F, -0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(57, 0).mirror().addBox(-0.9673F, -0.4678F, -3.0218F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, -0.4252F, 0.7357F, 1.5404F, -0.1589F, -1.0362F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(25, 57).mirror().addBox(-1.0181F, -0.4426F, -2.9109F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, -0.4252F, 0.7357F, 2.1287F, 0.5469F, -0.922F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(59, 5).mirror().addBox(-0.4182F, -0.2384F, -0.8543F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4F, -0.4252F, 0.7357F, 1.3526F, -0.0033F, 0.2202F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(38, 65).mirror().addBox(-1.6F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.5841F, 2.1604F, 0.0175F, 0.0F, -0.5498F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(9, 32).mirror().addBox(-2.8126F, -0.8451F, -0.4852F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.6841F, 0.1604F, 0.0175F, 0.0F, -1.021F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(16, 46).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -2.6841F, 0.1604F, 0.0175F, 0.0F, -0.5847F));

		PartDefinition cube_r8 = main.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(38, 65).addBox(-0.4F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.5841F, 2.1604F, 0.0175F, 0.0F, 0.5498F));

		PartDefinition cube_r9 = main.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(16, 46).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6841F, 0.1604F, 0.0175F, 0.0F, 0.5847F));

		PartDefinition cube_r10 = main.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(9, 32).addBox(1.8126F, -0.8451F, -0.4852F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -2.6841F, 0.1604F, 0.0175F, 0.0F, 1.021F));

		PartDefinition cube_r11 = main.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(59, 5).addBox(-0.5818F, -0.2384F, -0.8543F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, -0.4252F, 0.7357F, 1.3526F, 0.0033F, -0.2202F));

		PartDefinition cube_r12 = main.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(25, 57).addBox(0.0181F, -0.4426F, -2.9109F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, -0.4252F, 0.7357F, 2.1287F, -0.5469F, 0.922F));

		PartDefinition cube_r13 = main.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(57, 0).addBox(-0.0327F, -0.4678F, -3.0218F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4F, -0.4252F, 0.7357F, 1.5404F, 0.1589F, 1.0362F));

		PartDefinition backleftflipper = main.addOrReplaceChild("backleftflipper", CubeListBuilder.create().texOffs(60, 30).addBox(-1.0F, -0.6F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(27, 0).addBox(1.0F, 0.0F, -1.0F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 1.4F, 0.8F, 0.0F, -0.4363F, 0.829F));

		PartDefinition backrightflipper = main.addOrReplaceChild("backrightflipper", CubeListBuilder.create().texOffs(60, 30).mirror().addBox(-2.0F, -0.6F, 0.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(27, 0).mirror().addBox(-7.0F, 0.0F, -1.0F, 6.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5F, 1.4F, 0.8F, 0.0F, 0.4363F, -0.829F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(31, 29).addBox(-0.5F, -0.6F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F))
				.texOffs(45, 36).addBox(0.0F, -1.1F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(45, 8).addBox(0.0F, -1.1F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(44, 21).addBox(0.0F, -1.1F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -2.4F, 3.7F, 0.1309F, -0.1309F, 0.0F));

		PartDefinition cube_r14 = tail.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(9, 30).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1841F, 4.4604F, 0.0171F, 0.0033F, -0.5847F));

		PartDefinition cube_r15 = tail.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(18, 30).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1841F, 2.4604F, 0.0169F, 0.0042F, -0.637F));

		PartDefinition cube_r16 = tail.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(0, 31).mirror().addBox(-1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1841F, 0.4604F, 0.0169F, 0.0042F, -0.637F));

		PartDefinition cube_r17 = tail.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(9, 30).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1841F, 4.4604F, 0.0171F, -0.0033F, 0.5847F));

		PartDefinition cube_r18 = tail.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(18, 30).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1841F, 2.4604F, 0.0169F, -0.0042F, 0.637F));

		PartDefinition cube_r19 = tail.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(0, 31).addBox(0.0F, 0.0F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1841F, 0.4604F, 0.0169F, -0.0042F, 0.637F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(36, 39).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(0, 44).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 29).addBox(0.0F, -0.8F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 13).addBox(0.0F, -0.8F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.3F, 5.9F, 0.1745F, -0.1745F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(9, 30).addBox(-0.5F, -0.3F, 0.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F))
				.texOffs(27, 35).addBox(0.0F, -0.7F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(40, 29).addBox(0.0F, -0.6F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(39, 39).addBox(0.0F, -0.6F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.0F, 0.1745F, -0.2618F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 44).addBox(-0.5F, -0.3F, -0.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F))
				.texOffs(36, 39).addBox(0.0F, -0.6F, -0.1F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(21, 38).addBox(0.0F, -0.6F, 1.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(18, 38).addBox(0.0F, -0.5F, 3.9F, 0.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, 0.0F, 6.1F, 0.1309F, -0.2182F, 0.0F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 4.8F, -0.0177F, -0.1745F, 0.0031F));

		PartDefinition cube_r20 = tail5.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(49, 26).addBox(-0.5F, 0.9F, 0.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.004F)), PartPose.offsetAndRotation(0.0F, -1.2F, -0.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create(), PartPose.offset(0.0F, 0.3F, 3.9F));

		PartDefinition cube_r21 = tail6.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(19, 43).addBox(-1.0F, -1.1244F, -0.2972F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.5F, 7.0F, 5.2F, -0.7156F, 0.0F, 0.0F));

		PartDefinition cube_r22 = tail6.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(9, 38).addBox(-1.0F, -0.7918F, -0.075F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 1.6F, 2.1F, -1.0123F, 0.0F, 0.0F));

		PartDefinition cube_r23 = tail6.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(56, 38).addBox(-0.5F, -0.8079F, -2.6848F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, 1.6F, 2.1F, -0.5061F, 0.0F, 0.0F));

		PartDefinition upperbody = main.addOrReplaceChild("upperbody", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -2.8F, -0.1F, 0.1233F, -0.0869F, 0.0876F));

		PartDefinition cube_r24 = upperbody.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(45, 47).addBox(0.0F, -0.7F, 8.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(16, 48).addBox(0.0F, -0.8F, 6.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(49, 26).addBox(0.0F, -0.9F, 4.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 51).addBox(0.0F, -0.9F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(53, 45).addBox(0.0F, -0.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 16).addBox(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -9.9F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r25 = upperbody.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(32, 29).mirror().addBox(-3.9916F, -2.5101F, -0.4852F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2841F, -1.4396F, 0.0155F, 0.0081F, -1.4486F));

		PartDefinition cube_r26 = upperbody.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(49, 17).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2841F, -1.4396F, 0.0175F, 0.0F, -0.9687F));

		PartDefinition cube_r27 = upperbody.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(35, 52).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2841F, -1.4396F, 0.0175F, 0.0F, -0.5323F));

		PartDefinition cube_r28 = upperbody.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(36, 37).mirror().addBox(-5.9916F, -2.5101F, -0.4852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5841F, -3.4396F, 0.0336F, 0.0755F, -1.4129F));

		PartDefinition cube_r29 = upperbody.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(62, 33).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5841F, -3.4396F, 0.0647F, 0.0515F, -0.9325F));

		PartDefinition cube_r30 = upperbody.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(63, 0).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.5841F, -3.4396F, 0.082F, 0.0267F, -0.4966F));

		PartDefinition cube_r31 = upperbody.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(7, 63).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8841F, -5.4396F, 0.1121F, 0.1028F, -0.8765F));

		PartDefinition cube_r32 = upperbody.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(63, 14).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8841F, -5.4396F, 0.1466F, 0.0533F, -0.4416F));

		PartDefinition cube_r33 = upperbody.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(33, 5).mirror().addBox(-6.9916F, -2.5101F, -0.4852F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.8841F, -5.4396F, 0.0519F, 0.1429F, -1.3585F));

		PartDefinition cube_r34 = upperbody.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(9, 28).mirror().addBox(-7.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1841F, -7.4396F, 0.0705F, 0.2102F, -1.3727F));

		PartDefinition cube_r35 = upperbody.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(32, 63).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1841F, -7.4396F, 0.2114F, 0.0796F, -0.4548F));

		PartDefinition cube_r36 = upperbody.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(39, 63).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.1841F, -7.4396F, 0.1601F, 0.1539F, -0.8878F));

		PartDefinition cube_r37 = upperbody.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(46, 63).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2841F, -9.4396F, 0.2439F, 0.0927F, -0.4171F));

		PartDefinition cube_r38 = upperbody.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(32, 27).mirror().addBox(-7.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2841F, -9.4396F, 0.0801F, 0.2439F, -1.3357F));

		PartDefinition cube_r39 = upperbody.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(63, 55).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -1.2841F, -9.4396F, 0.1843F, 0.1793F, -0.8489F));

		PartDefinition cube_r40 = upperbody.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(35, 52).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2841F, -1.4396F, 0.0175F, 0.0F, 0.5323F));

		PartDefinition cube_r41 = upperbody.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(49, 17).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2841F, -1.4396F, 0.0175F, 0.0F, 0.9687F));

		PartDefinition cube_r42 = upperbody.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(32, 29).addBox(2.9916F, -2.5101F, -0.4852F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2841F, -1.4396F, 0.0155F, -0.0081F, 1.4486F));

		PartDefinition cube_r43 = upperbody.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(63, 0).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5841F, -3.4396F, 0.082F, -0.0267F, 0.4966F));

		PartDefinition cube_r44 = upperbody.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(62, 33).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5841F, -3.4396F, 0.0647F, -0.0515F, 0.9325F));

		PartDefinition cube_r45 = upperbody.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(36, 37).addBox(2.9916F, -2.5101F, -0.4852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.5841F, -3.4396F, 0.0336F, -0.0755F, 1.4129F));

		PartDefinition cube_r46 = upperbody.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(33, 5).addBox(2.9916F, -2.5101F, -0.4852F, 4.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8841F, -5.4396F, 0.0519F, -0.1429F, 1.3585F));

		PartDefinition cube_r47 = upperbody.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(63, 14).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8841F, -5.4396F, 0.1466F, -0.0533F, 0.4416F));

		PartDefinition cube_r48 = upperbody.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(7, 63).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.8841F, -5.4396F, 0.1121F, -0.1028F, 0.8765F));

		PartDefinition cube_r49 = upperbody.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(39, 63).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1841F, -7.4396F, 0.1601F, -0.1539F, 0.8878F));

		PartDefinition cube_r50 = upperbody.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(32, 63).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1841F, -7.4396F, 0.2114F, -0.0796F, 0.4548F));

		PartDefinition cube_r51 = upperbody.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(9, 28).addBox(2.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.1841F, -7.4396F, 0.0705F, -0.2102F, 1.3727F));

		PartDefinition cube_r52 = upperbody.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(63, 55).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2841F, -9.4396F, 0.1843F, -0.1793F, 0.8489F));

		PartDefinition cube_r53 = upperbody.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(32, 27).addBox(2.9916F, -2.5101F, -0.4852F, 5.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2841F, -9.4396F, 0.0801F, -0.2439F, 1.3357F));

		PartDefinition cube_r54 = upperbody.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(46, 63).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -1.2841F, -9.4396F, 0.2439F, -0.0927F, 0.4171F));

		PartDefinition cube_r55 = upperbody.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(13, 16).addBox(-4.5F, -0.8656F, -0.0436F, 9.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4F, -10.3F, 0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r56 = upperbody.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(0, 8).addBox(-3.5F, -0.9703F, -0.0422F, 7.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 6.4F, -6.3F, 0.2531F, 0.0F, 0.0F));

		PartDefinition chest = upperbody.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.4F, -9.9F, 0.0398F, -0.0872F, 0.0438F));

		PartDefinition cube_r57 = chest.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(29, 37).addBox(0.0F, -1.7F, 1.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(58, 50).addBox(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -12.5F, 0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r58 = chest.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(52, 58).mirror().addBox(-0.5F, -0.708F, -1.0538F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.4532F, 5.8135F, -10.1567F, 1.4693F, -0.1313F, -1.2238F));

		PartDefinition cube_r59 = chest.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(0, 62).mirror().addBox(-0.5F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(0, 62).addBox(7.9F, -0.7F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(-4.2F, 4.1488F, -9.8651F, 1.3352F, 0.0F, 0.0F));

		PartDefinition cube_r60 = chest.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(62, 38).mirror().addBox(-1.6982F, -0.6229F, -0.0826F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 5.6498F, -12.7241F, -0.4009F, 0.0713F, 0.4616F));

		PartDefinition cube_r61 = chest.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(61, 10).mirror().addBox(-3.2255F, -0.0824F, -0.3476F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-0.4F, 5.6498F, -12.7241F, -0.6392F, 0.4753F, 0.6996F));

		PartDefinition cube_r62 = chest.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(23, 50).mirror().addBox(-0.5F, -1.2626F, -1.2203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)).mirror(false), PartPose.offsetAndRotation(-2.4532F, 5.8135F, -10.1567F, 1.1202F, -0.1313F, -1.2238F));

		PartDefinition cube_r63 = chest.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(64, 47).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4159F, -11.2396F, 0.4574F, 0.1746F, -0.4583F));

		PartDefinition cube_r64 = chest.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(64, 49).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4159F, -11.2396F, 0.349F, 0.3413F, -0.8761F));

		PartDefinition cube_r65 = chest.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(27, 45).mirror().addBox(-5.9916F, -2.5101F, -0.4852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.4159F, -11.2396F, 0.1472F, 0.4619F, -1.3821F));

		PartDefinition cube_r66 = chest.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(64, 51).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1159F, -9.4396F, 0.4408F, 0.1686F, -0.4088F));

		PartDefinition cube_r67 = chest.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(52, 64).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1159F, -9.4396F, 0.3358F, 0.3291F, -0.8281F));

		PartDefinition cube_r68 = chest.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-8.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1159F, -9.4396F, 0.1416F, 0.4452F, -1.3322F));

		PartDefinition cube_r69 = chest.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(59, 64).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1841F, -7.4396F, 0.4077F, 0.1563F, -0.3618F));

		PartDefinition cube_r70 = chest.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(64, 60).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1841F, -7.4396F, 0.3096F, 0.3046F, -0.7839F));

		PartDefinition cube_r71 = chest.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(44, 0).mirror().addBox(-8.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1841F, -7.4396F, 0.1306F, 0.4118F, -1.2844F));

		PartDefinition cube_r72 = chest.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(65, 4).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1841F, -1.5396F, 0.2927F, 0.1121F, -0.4121F));

		PartDefinition cube_r73 = chest.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(6, 65).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1841F, -1.5396F, 0.2211F, 0.2173F, -0.8416F));

		PartDefinition cube_r74 = chest.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(45, 43).mirror().addBox(-8.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.1841F, -1.5396F, 0.0947F, 0.2943F, -1.3318F));

		PartDefinition cube_r75 = chest.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(65, 6).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2841F, -3.5396F, 0.3583F, 0.1376F, -0.369F));

		PartDefinition cube_r76 = chest.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(13, 65).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2841F, -3.5396F, 0.2712F, 0.2674F, -0.7947F));

		PartDefinition cube_r77 = chest.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(49, 13).mirror().addBox(-8.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.2841F, -3.5396F, 0.1148F, 0.3615F, -1.2904F));

		PartDefinition cube_r78 = chest.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(49, 15).mirror().addBox(-8.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3841F, -5.4396F, 0.1253F, 0.395F, -1.2865F));

		PartDefinition cube_r79 = chest.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(65, 26).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3841F, -5.4396F, 0.2967F, 0.2922F, -0.7877F));

		PartDefinition cube_r80 = chest.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(31, 65).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, -0.3841F, -5.4396F, 0.3912F, 0.1501F, -0.3643F));

		PartDefinition cube_r81 = chest.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(45, 43).addBox(2.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1841F, -1.5396F, 0.0947F, -0.2943F, 1.3318F));

		PartDefinition cube_r82 = chest.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(6, 65).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1841F, -1.5396F, 0.2211F, -0.2173F, 0.8416F));

		PartDefinition cube_r83 = chest.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(65, 4).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1841F, -1.5396F, 0.2927F, -0.1121F, 0.4121F));

		PartDefinition cube_r84 = chest.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(49, 13).addBox(2.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2841F, -3.5396F, 0.1148F, -0.3615F, 1.2904F));

		PartDefinition cube_r85 = chest.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(13, 65).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2841F, -3.5396F, 0.2712F, -0.2674F, 0.7947F));

		PartDefinition cube_r86 = chest.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(65, 6).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.2841F, -3.5396F, 0.3583F, -0.1376F, 0.369F));

		PartDefinition cube_r87 = chest.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(23, 50).addBox(-0.5F, -1.2626F, -1.2203F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(2.4532F, 5.8135F, -10.1567F, 1.1202F, 0.1313F, 1.2238F));

		PartDefinition cube_r88 = chest.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(61, 10).addBox(1.2255F, -0.0824F, -0.3476F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, 5.6498F, -12.7241F, -0.6392F, -0.4753F, -0.6996F));

		PartDefinition cube_r89 = chest.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(62, 38).addBox(-0.3018F, -0.6229F, -0.0826F, 2.0F, 1.0F, 1.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.4F, 5.6498F, -12.7241F, -0.4009F, -0.0713F, -0.4616F));

		PartDefinition cube_r90 = chest.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(52, 58).addBox(-0.5F, -0.708F, -1.0538F, 1.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.4532F, 5.8135F, -10.1567F, 1.4693F, 0.1313F, 1.2238F));

		PartDefinition cube_r91 = chest.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(57, 55).addBox(-0.5F, -0.5F, -3.9F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 6.7498F, -8.6241F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r92 = chest.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(27, 45).addBox(2.9916F, -2.5101F, -0.4852F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4159F, -11.2396F, 0.1472F, -0.4619F, 1.3821F));

		PartDefinition cube_r93 = chest.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(64, 49).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4159F, -11.2396F, 0.349F, -0.3413F, 0.8761F));

		PartDefinition cube_r94 = chest.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(64, 47).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.4159F, -11.2396F, 0.4574F, -0.1746F, 0.4583F));

		PartDefinition cube_r95 = chest.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(44, 0).addBox(2.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1159F, -9.4396F, 0.1416F, -0.4452F, 1.3322F));

		PartDefinition cube_r96 = chest.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(52, 64).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1159F, -9.4396F, 0.3358F, -0.3291F, 0.8281F));

		PartDefinition cube_r97 = chest.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(64, 51).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1159F, -9.4396F, 0.4408F, -0.1686F, 0.4088F));

		PartDefinition cube_r98 = chest.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(44, 0).addBox(2.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1841F, -7.4396F, 0.1306F, -0.4118F, 1.2844F));

		PartDefinition cube_r99 = chest.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(64, 60).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1841F, -7.4396F, 0.3096F, -0.3046F, 0.7839F));

		PartDefinition cube_r100 = chest.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(59, 64).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.1841F, -7.4396F, 0.4077F, -0.1563F, 0.3618F));

		PartDefinition cube_r101 = chest.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(31, 65).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3841F, -5.4396F, 0.3912F, -0.1501F, 0.3643F));

		PartDefinition cube_r102 = chest.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(65, 26).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3841F, -5.4396F, 0.2967F, -0.2922F, 0.7877F));

		PartDefinition cube_r103 = chest.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(49, 15).addBox(2.9916F, -2.5101F, -0.4852F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, -0.3841F, -5.4396F, 0.1253F, -0.395F, 1.2865F));

		PartDefinition cube_r104 = chest.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(21, 8).addBox(-4.0F, -1.0003F, -3.0254F, 8.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.7F, -6.4F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r105 = chest.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(0, 0).addBox(-5.0F, 8.0135F, -0.0537F, 10.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.3F, -5.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r106 = chest.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(13, 16).addBox(0.0F, -0.4F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.9532F, -1.4396F, -0.096F, 0.0F, 0.0F));

		PartDefinition cube_r107 = chest.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(21, 8).addBox(0.5F, -0.8865F, 1.9463F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 28).addBox(0.0F, 0.0135F, -0.0537F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, -0.8F, -5.9F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r108 = chest.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(27, 0).addBox(0.0F, -0.5F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0627F, -5.4394F, 0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r109 = chest.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(0, 38).addBox(0.5F, -1.7F, 2.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(3, 38).addBox(0.5F, -1.8F, 0.0F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 47).addBox(0.0F, -1.0F, 0.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 0.7F, -9.8F, 0.1222F, 0.0F, 0.0F));

		PartDefinition frontleftflipper = chest.addOrReplaceChild("frontleftflipper", CubeListBuilder.create().texOffs(0, 28).addBox(0.5838F, -0.5902F, -0.8511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F))
				.texOffs(36, 15).addBox(1.5838F, -0.5902F, -1.3511F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(25, 62).addBox(-0.4162F, -0.5902F, -1.3511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F))
				.texOffs(23, 22).addBox(1.5838F, -0.0902F, -1.3511F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9F, 4.9F, -9.7F, -0.0539F, -0.518F, 0.7635F));

		PartDefinition frontrightflipper = chest.addOrReplaceChild("frontrightflipper", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-1.5838F, -0.5902F, -0.8511F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(36, 15).mirror().addBox(-3.5838F, -0.5902F, -1.3511F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(25, 62).mirror().addBox(-0.5838F, -0.5902F, -1.3511F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)).mirror(false)
				.texOffs(23, 22).mirror().addBox(-9.5838F, -0.0902F, -1.3511F, 8.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.9F, 4.9F, -9.7F, 0.0339F, 0.0916F, -0.7802F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.8F, -12.5F, -0.0318F, 0.0839F, -0.0949F));

		PartDefinition cube_r110 = neck.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(9, 38).addBox(0.0F, -0.6F, -0.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 38).addBox(0.0F, -0.6F, 1.5F, 0.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(43, 58).addBox(-0.5F, 0.0F, -0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.4F, -2.4F, 0.3316F, 0.0F, 0.0F));

		PartDefinition cube_r111 = neck.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(64, 16).mirror().addBox(-2.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1159F, -0.4396F, 0.5352F, 0.2156F, -0.583F));

		PartDefinition cube_r112 = neck.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(64, 35).mirror().addBox(-3.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1159F, -0.4396F, 0.4063F, 0.4096F, -0.9949F));

		PartDefinition cube_r113 = neck.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(0, 36).mirror().addBox(-3.9916F, -2.5101F, -0.4852F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.5F, 0.1159F, -0.4396F, 0.1619F, 0.5476F, -1.5148F));

		PartDefinition cube_r114 = neck.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(64, 16).addBox(0.0F, 0.0F, -0.5F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1159F, -0.4396F, 0.5352F, -0.2156F, 0.583F));

		PartDefinition cube_r115 = neck.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(64, 35).addBox(1.8126F, -0.8451F, -0.4852F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1159F, -0.4396F, 0.4063F, -0.4096F, 0.9949F));

		PartDefinition cube_r116 = neck.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(0, 36).addBox(2.9916F, -2.5101F, -0.4852F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5F, 0.1159F, -0.4396F, 0.1619F, -0.5476F, 1.5148F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create().texOffs(18, 27).addBox(-2.0F, -1.5F, -4.8F, 4.0F, 2.0F, 5.0F, new CubeDeformation(0.003F))
				.texOffs(56, 26).addBox(-1.5F, 0.0F, -6.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(55, 17).addBox(-1.5F, 0.3F, -6.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F))
				.texOffs(53, 45).addBox(-1.0F, 0.1F, -9.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F))
				.texOffs(8, 53).addBox(-1.0F, 0.3F, -9.3F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.13F))
				.texOffs(40, 27).addBox(-0.2F, 0.2F, -14.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F))
				.texOffs(0, 36).addBox(-0.2F, 0.4F, -14.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.22F))
				.texOffs(40, 27).mirror().addBox(-0.8F, 0.2F, -14.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 36).mirror().addBox(-0.8F, 0.4F, -14.9F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.22F)).mirror(false), PartPose.offsetAndRotation(0.0F, 1.1F, -2.5F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r117 = head.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(53, 33).mirror().addBox(-0.4F, -0.5323F, -4.525F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F)).mirror(false)
				.texOffs(45, 35).mirror().addBox(-0.4F, -0.8323F, -3.225F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.8F)).mirror(false), PartPose.offsetAndRotation(-1.85F, -1.6F, -2.95F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r118 = head.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(0, 56).mirror().addBox(-0.6F, -1.4106F, -1.8129F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.404F)).mirror(false)
				.texOffs(0, 56).addBox(2.3F, -1.4106F, -1.8129F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.404F)), PartPose.offsetAndRotation(-1.85F, -0.5F, -2.85F, 1.5882F, 0.0F, 0.0F));

		PartDefinition cube_r119 = head.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(59, 21).mirror().addBox(-0.6F, -1.553F, -0.4358F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.41F)).mirror(false)
				.texOffs(59, 21).addBox(2.3F, -1.553F, -0.4358F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.41F)), PartPose.offsetAndRotation(-1.85F, 0.9F, -3.75F, 1.2479F, 0.0F, 0.0F));

		PartDefinition cube_r120 = head.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(18, 60).mirror().addBox(-0.3F, -0.1227F, -1.9512F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)).mirror(false)
				.texOffs(18, 60).addBox(3.0F, -0.1227F, -1.9512F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.11F)), PartPose.offsetAndRotation(-1.85F, -1.4F, -1.15F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r121 = head.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(32, 47).mirror().addBox(-0.34F, -0.8024F, -0.9784F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(45, 47).mirror().addBox(-0.32F, -1.3024F, -1.4784F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.6F)).mirror(false)
				.texOffs(32, 47).addBox(1.04F, -0.8024F, -0.9784F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.6F))
				.texOffs(45, 47).addBox(3.02F, -1.3024F, -1.4784F, 2.0F, 3.0F, 3.0F, new CubeDeformation(-0.6F)), PartPose.offsetAndRotation(-2.35F, -0.5F, -2.85F, 0.1134F, 0.0F, 0.0F));

		PartDefinition cube_r122 = head.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-0.7F, -1.6587F, -2.1897F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.49F)).mirror(false)
				.texOffs(0, 16).addBox(2.4F, -1.6587F, -2.1897F, 2.0F, 3.0F, 2.0F, new CubeDeformation(-0.49F)), PartPose.offsetAndRotation(-1.85F, -0.5F, -2.85F, -3.0892F, 0.0F, 0.0F));

		PartDefinition cube_r123 = head.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.2F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)).mirror(false)
				.texOffs(0, 0).addBox(1.2F, -1.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2F, -0.1F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r124 = head.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(53, 33).addBox(-2.6F, -0.5323F, -4.525F, 3.0F, 2.0F, 2.0F, new CubeDeformation(-0.7F))
				.texOffs(45, 35).addBox(-0.6F, -0.8323F, -3.225F, 1.0F, 3.0F, 4.0F, new CubeDeformation(-0.8F)), PartPose.offsetAndRotation(1.85F, -1.6F, -2.95F, 0.4014F, 0.0F, 0.0F));

		PartDefinition cube_r125 = head.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(34, 58).addBox(-0.5F, -0.0618F, -2.5046F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, -0.3F, -6.0F, 0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r126 = head.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(13, 22).addBox(-2.0F, 0.9733F, -1.9791F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.9F, -4.5F, 0.6894F, 0.0F, 0.0F));

		PartDefinition cube_r127 = head.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(0, 22).addBox(-1.0F, -0.0141F, -2.0447F, 2.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -0.8F, -5.3F, 0.4974F, 0.0F, 0.0F));

		PartDefinition cube_r128 = head.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(17, 56).addBox(-1.5F, -0.0318F, -2.0665F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(0.0F, -1.5F, -4.7F, 0.8814F, 0.0F, 0.0F));

		PartDefinition cube_r129 = head.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(38, 54).addBox(-1.5F, -0.0394F, -1.99F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0976F, -2.9343F, 0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r130 = head.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(44, 21).addBox(-2.0F, -0.0394F, 0.01F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -2.0976F, -2.9343F, -0.0785F, 0.0F, 0.0F));

		PartDefinition cube_r131 = head.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(27, 37).mirror().addBox(1.0F, -0.2F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.204F)).mirror(false)
				.texOffs(27, 37).addBox(1.6F, -0.2F, -0.2F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.204F)), PartPose.offsetAndRotation(-1.8F, 0.4F, -14.7F, 0.0349F, 0.0F, 0.0F));

		PartDefinition cube_r132 = head.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(45, 2).addBox(-2.0F, -1.9643F, -3.0306F, 4.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.3F, -1.7F, -0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r133 = head.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(48, 8).addBox(-2.0F, -2.0F, -2.0F, 4.0F, 2.0F, 2.0F, new CubeDeformation(-0.0004F)), PartPose.offsetAndRotation(0.0F, 0.5F, 0.1F, 0.4363F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create().texOffs(9, 58).addBox(1.0F, 0.4F, -4.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F))
				.texOffs(61, 43).addBox(0.5F, 0.4F, -6.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(61, 43).mirror().addBox(-1.5F, 0.4F, -6.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(9, 58).mirror().addBox(-2.0F, 0.4F, -4.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.004F)).mirror(false)
				.texOffs(49, 54).addBox(-1.5F, 0.1F, -6.4F, 3.0F, 1.0F, 2.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 1.0F, 0.0F, 0.3043F, -0.0188F, 0.0127F));

		PartDefinition cube_r134 = jaw.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(18, 35).addBox(-0.5F, -0.7F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.22F))
				.texOffs(40, 13).addBox(-0.5F, -0.5F, -0.1F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.5F, -14.7F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r135 = jaw.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(0, 51).addBox(-1.0F, -0.7F, -1.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.12F))
				.texOffs(27, 52).addBox(-1.0F, -0.5F, -1.4F, 2.0F, 1.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.7F, -7.8F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r136 = jaw.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(0, 11).mirror().addBox(-2.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(0, 11).addBox(1.0F, -1.0F, 0.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.4F, -1.4F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r137 = jaw.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(59, 60).mirror().addBox(-2.0F, -0.2098F, -0.0417F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)).mirror(false)
				.texOffs(59, 60).addBox(1.0F, -0.2098F, -0.0417F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.008F)), PartPose.offsetAndRotation(0.0F, 0.5F, -0.8F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r138 = jaw.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(0, 8).mirror().addBox(-2.0F, -0.0509F, -1.0573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)).mirror(false)
				.texOffs(0, 8).addBox(1.0F, -0.0509F, -1.0573F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.005F)), PartPose.offsetAndRotation(0.0F, 0.2F, -0.4F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 70, 70);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}