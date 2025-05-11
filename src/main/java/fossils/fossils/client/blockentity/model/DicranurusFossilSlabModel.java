package fossils.fossils.client.blockentity.model;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class DicranurusFossilSlabModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Root;
	private final ModelPart Head;
	private final ModelPart forehead;
	private final ModelPart lhorn;
	private final ModelPart lhorn2;
	private final ModelPart lhorn3;
	private final ModelPart lhorn4;
	private final ModelPart lhorn9;
	private final ModelPart lhorn10;
	private final ModelPart lhorn11;
	private final ModelPart lhorn12;
	private final ModelPart lhorn5;
	private final ModelPart lhorn6;
	private final ModelPart lhorn7;
	private final ModelPart lhorn8;
	private final ModelPart lside5;
	private final ModelPart lside6;
	private final ModelPart lside2;
	private final ModelPart lside3;
	private final ModelPart lspikelarge2;
	private final ModelPart lspikelarge3;
	private final ModelPart lspikelarge4;
	private final ModelPart lside4;
	private final ModelPart lside7;
	private final ModelPart lspikelarge5;
	private final ModelPart lspikelarge6;
	private final ModelPart lspikelarge7;
	private final ModelPart Body;
	private final ModelPart Body2;
	private final ModelPart lspikesmall;
	private final ModelPart lspikesmall2;
	private final ModelPart lspikesmall5;
	private final ModelPart lspikesmall6;
	private final ModelPart lspikesmall7;
	private final ModelPart lspikesmall8;
	private final ModelPart lspikesmall9;
	private final ModelPart lspikesmall10;
	private final ModelPart Body3;
	private final ModelPart Body4;
	private final ModelPart lspikesmall3;
	private final ModelPart lspikesmall4;

	public DicranurusFossilSlabModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Root = this.fossil.getChild("Root");
		this.Head = this.Root.getChild("Head");
		this.forehead = this.Head.getChild("forehead");
		this.lhorn = this.forehead.getChild("lhorn");
		this.lhorn2 = this.lhorn.getChild("lhorn2");
		this.lhorn3 = this.lhorn2.getChild("lhorn3");
		this.lhorn4 = this.lhorn3.getChild("lhorn4");
		this.lhorn9 = this.forehead.getChild("lhorn9");
		this.lhorn10 = this.lhorn9.getChild("lhorn10");
		this.lhorn11 = this.lhorn10.getChild("lhorn11");
		this.lhorn12 = this.lhorn11.getChild("lhorn12");
		this.lhorn5 = this.forehead.getChild("lhorn5");
		this.lhorn6 = this.lhorn5.getChild("lhorn6");
		this.lhorn7 = this.lhorn6.getChild("lhorn7");
		this.lhorn8 = this.lhorn7.getChild("lhorn8");
		this.lside5 = this.Head.getChild("lside5");
		this.lside6 = this.lside5.getChild("lside6");
		this.lside2 = this.Head.getChild("lside2");
		this.lside3 = this.lside2.getChild("lside3");
		this.lspikelarge2 = this.lside3.getChild("lspikelarge2");
		this.lspikelarge3 = this.lspikelarge2.getChild("lspikelarge3");
		this.lspikelarge4 = this.lspikelarge3.getChild("lspikelarge4");
		this.lside4 = this.Head.getChild("lside4");
		this.lside7 = this.lside4.getChild("lside7");
		this.lspikelarge5 = this.lside7.getChild("lspikelarge5");
		this.lspikelarge6 = this.lspikelarge5.getChild("lspikelarge6");
		this.lspikelarge7 = this.lspikelarge6.getChild("lspikelarge7");
		this.Body = this.Root.getChild("Body");
		this.Body2 = this.Body.getChild("Body2");
		this.lspikesmall = this.Body2.getChild("lspikesmall");
		this.lspikesmall2 = this.lspikesmall.getChild("lspikesmall2");
		this.lspikesmall5 = this.Body2.getChild("lspikesmall5");
		this.lspikesmall6 = this.lspikesmall5.getChild("lspikesmall6");
		this.lspikesmall7 = this.Body2.getChild("lspikesmall7");
		this.lspikesmall8 = this.lspikesmall7.getChild("lspikesmall8");
		this.lspikesmall9 = this.Body2.getChild("lspikesmall9");
		this.lspikesmall10 = this.lspikesmall9.getChild("lspikesmall10");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body4 = this.Body3.getChild("Body4");
		this.lspikesmall3 = this.Body.getChild("lspikesmall3");
		this.lspikesmall4 = this.lspikesmall3.getChild("lspikesmall4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(35, 31).addBox(-2.0F, -3.5507F, -0.3711F, 4.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(37, 40).addBox(-4.7F, -2.0F, -4.0F, 5.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.5892F, -1.0F, 6.3231F, 0.0F, -0.5672F, 0.0F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(17, 29).addBox(-3.7F, -1.5F, -5.9F, 7.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0234F, -0.5F, 0.242F, 0.0F, 0.0436F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(24, 15).addBox(-6.3F, -0.5F, -0.9F, 6.0F, 1.0F, 8.0F, new CubeDeformation(-0.003F)), PartPose.offsetAndRotation(2.0F, -0.5F, -4.1F, 0.0F, 0.5672F, 0.0F));

		PartDefinition cube_r4 = fossil.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(0.7F, -0.2F, -2.2F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4F, -2.0507F, 2.1289F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r5 = fossil.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(45, 0).addBox(-2.0F, -2.0F, -3.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -2.0F, -1.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Root = fossil.addOrReplaceChild("Root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -3.95F, -1.0F, -0.3578F, 0.0F, 0.0F));

		PartDefinition Head = Root.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 23).addBox(-2.0F, 0.4433F, -2.5833F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -0.6933F, -1.8167F));

		PartDefinition cube_r6 = Head.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(24, 20).mirror().addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.35F, -0.3067F, -1.2333F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r7 = Head.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(24, 25).addBox(-0.5F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.35F, -0.3067F, -1.2333F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r8 = Head.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(18, 36).addBox(0.0F, -1.28F, -7.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 38).addBox(0.0F, -1.98F, -7.5F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(38, 36).addBox(1.5F, -1.58F, -7.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.003F))
				.texOffs(0, 47).addBox(1.5F, -1.98F, -7.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(4.0F, 1.7433F, -0.0833F, 0.0F, 1.5708F, 0.0F));

		PartDefinition forehead = Head.addOrReplaceChild("forehead", CubeListBuilder.create().texOffs(0, 7).addBox(-1.0F, -0.0076F, 0.1617F, 2.0F, 1.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(49, 49).addBox(-2.0F, 0.1525F, 0.3525F, 4.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.2567F, -3.1833F, 0.3054F, 0.0F, 0.0F));

		PartDefinition lhorn = forehead.addOrReplaceChild("lhorn", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 0.2804F, 3.5722F, 0.3517F, 0.6284F, 0.0327F));

		PartDefinition lhorn2 = lhorn.addOrReplaceChild("lhorn2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 0.0F, 1.8F, -0.3267F, -0.4948F, 0.0386F));

		PartDefinition lhorn3 = lhorn2.addOrReplaceChild("lhorn3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.0F, 2.8F, -1.1965F, 0.2279F, -0.4919F));

		PartDefinition lhorn4 = lhorn3.addOrReplaceChild("lhorn4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0411F, 0.2701F, 1.6623F, -0.9261F, -0.1125F, -0.6279F));

		PartDefinition lhorn9 = forehead.addOrReplaceChild("lhorn9", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 0.2804F, 3.6722F, 0.1772F, 0.6284F, 0.0327F));

		PartDefinition cube_r9 = lhorn9.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(13, 45).addBox(-0.2994F, -0.1831F, 0.0944F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0424F, -0.3899F, 0.141F));

		PartDefinition lhorn10 = lhorn9.addOrReplaceChild("lhorn10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 0.0F, 1.8F, -0.3267F, -0.4948F, 0.0386F));

		PartDefinition lhorn11 = lhorn10.addOrReplaceChild("lhorn11", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.0F, 2.8F, -1.1965F, 0.2279F, -0.4919F));

		PartDefinition lhorn12 = lhorn11.addOrReplaceChild("lhorn12", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0411F, 0.2701F, 1.6623F, -0.9261F, -0.1125F, -0.6279F));

		PartDefinition lhorn5 = forehead.addOrReplaceChild("lhorn5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 0.2804F, 3.6722F, 0.1772F, -0.6284F, -0.0327F));

		PartDefinition cube_r10 = lhorn5.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(13, 45).mirror().addBox(-3.7006F, -0.1831F, 0.0944F, 4.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0424F, 0.3899F, -0.141F));

		PartDefinition lhorn6 = lhorn5.addOrReplaceChild("lhorn6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 0.0F, 1.8F, -0.3267F, 0.4948F, -0.0386F));

		PartDefinition lhorn7 = lhorn6.addOrReplaceChild("lhorn7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.0F, 2.8F, -1.1965F, -0.2279F, 0.4919F));

		PartDefinition lhorn8 = lhorn7.addOrReplaceChild("lhorn8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0411F, 0.2701F, 1.6623F, -0.9261F, 0.1125F, 0.6279F));

		PartDefinition lside5 = Head.addOrReplaceChild("lside5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 0.7433F, -3.1833F, 0.0F, -0.4363F, 0.0F));

		PartDefinition lside6 = lside5.addOrReplaceChild("lside6", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0F, 1.0F, 0.0F, 0.0F, 0.9599F, 0.0F));

		PartDefinition lside2 = Head.addOrReplaceChild("lside2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9F, 0.5433F, -3.0833F, 0.1375F, -0.2278F, 0.1934F));

		PartDefinition cube_r11 = lside2.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(24, 15).addBox(-1.5124F, -0.395F, -1.0802F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.5512F, 0.4422F, 0.9596F, 0.0038F, 0.0809F, 0.0496F));

		PartDefinition lside3 = lside2.addOrReplaceChild("lside3", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0389F, 0.9372F, -0.1206F, 0.0F, 0.8552F, 0.0F));

		PartDefinition cube_r12 = lside3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(23, 7).addBox(-1.6575F, -0.205F, -1.2346F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4876F, -0.495F, 1.0802F, -0.1567F, -0.0645F, 0.1036F));

		PartDefinition lspikelarge2 = lside3.addOrReplaceChild("lspikelarge2", CubeListBuilder.create().texOffs(0, 29).addBox(-2.1924F, -0.0281F, -0.6173F, 4.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.0284F, -0.6675F, 2.2094F, 0.3006F, 1.2015F, -0.0991F));

		PartDefinition lspikelarge3 = lspikelarge2.addOrReplaceChild("lspikelarge3", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8076F, 0.3658F, 3.3133F, 0.0F, -0.4363F, 0.0F));

		PartDefinition lspikelarge4 = lspikelarge3.addOrReplaceChild("lspikelarge4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, -0.2182F, 0.0F));

		PartDefinition lside4 = Head.addOrReplaceChild("lside4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9F, 0.5433F, -3.0833F, 0.1375F, 0.2278F, -0.1934F));

		PartDefinition cube_r13 = lside4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(24, 15).mirror().addBox(-0.4876F, -0.395F, -1.0802F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.5512F, 0.4422F, 0.9596F, 0.0038F, -0.0809F, -0.0496F));

		PartDefinition lside7 = lside4.addOrReplaceChild("lside7", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0389F, 0.9372F, -0.1206F, 0.0F, -0.8552F, 0.0F));

		PartDefinition cube_r14 = lside7.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(23, 7).mirror().addBox(-0.3425F, -0.205F, -1.2346F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.4876F, -0.495F, 1.0802F, -0.1567F, 0.0645F, -0.1036F));

		PartDefinition lspikelarge5 = lside7.addOrReplaceChild("lspikelarge5", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-1.8076F, -0.0281F, -0.6173F, 4.0F, 0.0F, 8.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.0284F, -0.6675F, 2.2094F, 0.3006F, -1.2015F, 0.0991F));

		PartDefinition lspikelarge6 = lspikelarge5.addOrReplaceChild("lspikelarge6", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8076F, 0.3658F, 3.3133F, 0.0F, 0.4363F, 0.0F));

		PartDefinition lspikelarge7 = lspikelarge6.addOrReplaceChild("lspikelarge7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.0F, 0.2182F, 0.0F));

		PartDefinition Body = Root.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(36, 27).addBox(-4.0F, -0.5F, 0.0F, 8.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.25F, -2.0F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Body.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(0, 25).addBox(0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.1F, 0.0F, 1.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r16 = Body.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(24, 15).addBox(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.0F, -0.2F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r17 = Body.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(15, 52).addBox(-1.0F, -0.0928F, -0.6999F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.003F)), PartPose.offsetAndRotation(0.0F, -1.345F, 0.7F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Body2 = Body.addOrReplaceChild("Body2", CubeListBuilder.create().texOffs(33, 48).addBox(-3.5F, -0.49F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(19, 42).addBox(-1.0F, -0.48F, 0.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r18 = Body2.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(23, 0).mirror().addBox(-3.8531F, 0.0F, 0.0073F, 4.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.5709F, 0.03F, 1.7963F, 0.0646F, -0.208F, -0.0381F));

		PartDefinition cube_r19 = Body2.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(23, 0).addBox(-0.1469F, 0.0F, 0.0073F, 4.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5709F, 0.03F, 1.7963F, 0.0646F, 0.208F, 0.0381F));

		PartDefinition cube_r20 = Body2.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(24, 52).addBox(-1.0F, -0.0828F, 1.3001F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.345F, -1.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition lspikesmall = Body2.addOrReplaceChild("lspikesmall", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition lspikesmall2 = lspikesmall.addOrReplaceChild("lspikesmall2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition lspikesmall5 = Body2.addOrReplaceChild("lspikesmall5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition lspikesmall6 = lspikesmall5.addOrReplaceChild("lspikesmall6", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition lspikesmall7 = Body2.addOrReplaceChild("lspikesmall7", CubeListBuilder.create().texOffs(45, 9).addBox(0.0F, -0.01F, 0.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.0F, 0.0F, 0.0F, -0.1745F, 0.0F));

		PartDefinition lspikesmall8 = lspikesmall7.addOrReplaceChild("lspikesmall8", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition lspikesmall9 = Body2.addOrReplaceChild("lspikesmall9", CubeListBuilder.create().texOffs(45, 9).mirror().addBox(-7.0F, -0.01F, 0.0F, 7.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.5F, 0.0F, 0.0F, 0.0F, 0.1745F, 0.0F));

		PartDefinition lspikesmall10 = lspikesmall9.addOrReplaceChild("lspikesmall10", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create().texOffs(49, 31).addBox(-3.5F, -0.5F, 0.0F, 7.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Body3.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.1373F, 0.0F, -0.583F, 4.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.238F, 0.04F, 1.4475F, 0.1136F, -0.1518F, 0.0056F));

		PartDefinition cube_r22 = Body3.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 0).addBox(-0.8627F, 0.0F, -0.583F, 4.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.238F, 0.04F, 1.4475F, 0.1136F, 0.1518F, -0.0056F));

		PartDefinition cube_r23 = Body3.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(33, 52).addBox(-1.0F, -0.0928F, 3.3001F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.345F, -3.3F, -0.0349F, 0.0F, 0.0F));

		PartDefinition Body4 = Body3.addOrReplaceChild("Body4", CubeListBuilder.create().texOffs(0, 19).addBox(-2.75F, -0.49F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 15).addBox(-0.25F, -0.49F, 0.0F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 23).addBox(-2.0F, -0.5F, 2.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 2.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r24 = Body4.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 15).mirror().addBox(-2.75F, 0.05F, -1.7F, 5.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.7F, -0.1F, 0.9F, 0.0999F, 0.0119F, 0.1005F));

		PartDefinition cube_r25 = Body4.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(23, 3).mirror().addBox(-1.824F, 0.0F, -1.5462F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -0.74F, 3.7947F, 0.1746F, 0.0344F, 0.0061F));

		PartDefinition cube_r26 = Body4.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(23, 3).addBox(0.824F, 0.0F, -1.5462F, 1.0F, 0.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -0.74F, 3.7947F, 0.1746F, -0.0344F, -0.0061F));

		PartDefinition cube_r27 = Body4.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(9, 0).addBox(-0.5F, -0.1151F, 1.9962F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(12, 38).addBox(-1.0F, -0.0977F, -0.0036F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.145F, 0.0F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r28 = Body4.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(0, 15).addBox(-2.25F, 0.05F, -1.7F, 5.0F, 0.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.7F, -0.1F, 0.9F, 0.0999F, -0.0119F, -0.1005F));

		PartDefinition lspikesmall3 = Body.addOrReplaceChild("lspikesmall3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5F, 0.0F, 1.0F, 0.0F, 0.2618F, 0.0F));

		PartDefinition lspikesmall4 = lspikesmall3.addOrReplaceChild("lspikesmall4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 70, 60);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F) + 1.5708F;
	}
}